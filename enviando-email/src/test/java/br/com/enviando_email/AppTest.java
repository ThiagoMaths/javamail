package br.com.enviando_email;



public class AppTest {
	

	
	@org.junit.Test
	public void testEmail() throws Exception {
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		stringBuilderTextoEmail.append("Olá, <br/> <br/>");
		stringBuilderTextoEmail.append("Você está recebendo o acesso ao curso de java<br/> <br/>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo.<br/> <br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://projetojavaweb.com/certificado-aluno/cursosliberados/49031\"> Acessar Portal do Aluno</a>");
		
		
		
	
		ObjetoEnviaEmail enviaEmail = 
				new ObjetoEnviaEmail("daianacossta@gmail.com", "Daiana Costa", "testando E-mail Java", stringBuilderTextoEmail.toString());
		
		enviaEmail.enviarEmailAnexo(true);
}
}
   