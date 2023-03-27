import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno[] alunos = new Aluno[10];
		int quant = 3;
		for(int i=0;i < quant; i++)
		{
			Aluno aluno = new Aluno();
			System.out.print("Nome:");
			aluno.setNome(sc.next());

			System.out.print("Matricula:");
			aluno.setMatricula(sc.nextInt());
			System.out.print("Idade:");
			aluno.setIdade(sc.nextInt());


			if (aluno.getIdade()<12)
				aluno.setTurma("Inf�ncia");
			else
			    if (aluno.getIdade()>12 && aluno.getIdade()<24)
				    aluno.setTurma("Adolesc�ncia");
			    else
				    aluno.setTurma("Adulto");

			alunos[i] = aluno;

		}

		System.out.println("RELA��O DE ALUNOS");
		System.out.println("-------------------------------------");
		System.out.println("Seq\tMatr.\tNome\tIdade\tTurma");
		int conta=1;
		for(int i=0; i<quant; i++){
			String s="";
			if (conta<10){
				s="00"+conta+"\t"+alunos[i].getMatricula()+"\t";
			    s+=""+alunos[i].getNome()+"\t "+alunos[i].getIdade()+"\t "+alunos[i].getTurma();
			}
			else
			{
				s="0"+conta+"  "+alunos[i].getMatricula()+"  ";
			    s+=""+alunos[i].getNome()+" "+alunos[i].getIdade()+" "+alunos[i].getTurma();
			}
		    System.out.println(s);
		    conta++;
		}

		sc.close();
	}

}
