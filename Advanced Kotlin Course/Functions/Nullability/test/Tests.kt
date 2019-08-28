import org.junit.Assert.*
import org.junit.Test

class MailCollector(): Mailer {
    data class Mail(val email: String, val message: String)

    val emails = mutableListOf<Mail>()

    override fun sendMessage(email: String, message: String) {
        emails += Mail(email, message)
    }
}

class Test {
    private val empty = mutableListOf<MailCollector.Mail>()

    @Test
    fun `When client is null, email we do not send email`() {
        val mailer = MailCollector()
        sendMessageToClient(null, "AAA", mailer)
        assertEquals(empty, mailer.emails)
    }

    @Test
    fun `When message is null, we do not send email`() {
        val mailer = MailCollector()
        sendMessageToClient(Client(PersonalInfo("AAA")), null, mailer)
        assertEquals(empty, mailer.emails)
    }

    @Test
    fun `When personal info is null, we do not send email`() {
        val mailer = MailCollector()
        sendMessageToClient(Client(null), "AAA", mailer)
        assertEquals(empty, mailer.emails)
    }

    @Test
    fun `When email address is null, we do not send email`() {
        val mailer = MailCollector()
        sendMessageToClient(Client(PersonalInfo(null)), null, mailer)
        assertEquals(empty, mailer.emails)
    }

    @Test
    fun `Sends messages correctly for correct values`() {
        val mailer = MailCollector()
        sendMessageToClient(Client(PersonalInfo("AAA")), "BBB", mailer)
        assertEquals(mutableListOf(MailCollector.Mail("AAA", "BBB")), mailer.emails)
    }
}