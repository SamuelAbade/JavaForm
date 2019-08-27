//Assinatura da Classe:
public class Cliente {
    public  String Nome;
    public  String CPF;
    public  String Sexo;
    public  String Nascimento;
    public  String Endereco;
    public String UF;
    public String Estado;

    public Cliente(){
        this.Nome = "";
        this.CPF = "";
        this.Nascimento = "";
        this.Sexo = "";
        this.Endereco = "";
        this.Estado = "";
    }

    public String getDadosCadastrar(){
        String dados = "Dados Cadastrados:\n\n";
        dados += "Nome: " + Nome + "\n";
        dados += "CPF: " + CPF + "\n";
        dados += "Sexo: " + Sexo + "\n";
        dados += "Nascimento: " + Nascimento + "\n\n";
        dados += "Endereço: " + Endereco + "\n";
        dados += "UF: " + UF + "\n";
        dados += "Estado: " + Estado + "\n";
        return dados;
    }

}