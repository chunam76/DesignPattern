package cor;

public class AuthenticationDemo {
	   public static void main(String[] args) {
		   
		   // chain 생성
		   AuthenticationProcessor processor =
				   new OAuthAuthenticationProcessor(
						   new UsernamePasswordAuthenticationProcessor(null));

		   AuthenticationProvider token = new OAuthTokenProvider();

		   AuthenticationProvider token2 = new SamlAuthenticationProvider();

		   AuthenticationProvider token3 = new UsernamePasswordProvider();

		   if(processor.isAuthorized(token)) {
			   System.out.println("인증성공");
		   } else {
			   System.out.println("인증실패");
		   }
	   }
}
