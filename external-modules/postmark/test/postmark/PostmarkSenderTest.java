package postmark;

import jobs.postmark.PostmarkSender;

import org.junit.Test;

import play.test.UnitTest;

public class PostmarkSenderTest extends UnitTest {
	
	@Test
	public void testSendMail() throws Exception {
		PostmarkSender.sendMail("foo@bar.com", "Subject", "Body");
	}

	@Test
	public void testSendMail_from() throws Exception {
		PostmarkSender.sendMail("from@bar.com", "foo@bar.com", "Subject", "Body");
	}
}
