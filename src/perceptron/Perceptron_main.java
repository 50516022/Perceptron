//nu�̏����l��0.5�ȉ����Ɗw�K�񐔂ɂ�炸�ŏ����琳�������肪�s���āA
//���̂悤��0.65��0.80�������l�ɒu���ƁA�w�K�񐔂����100�O��Ő��������肪�s���A150����Ώ\���ł��邱�Ƃ��킩�����B
//nu�̏����l���傫���قǕK�v�Ȋw�K�񐔂�������B
package perceptron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nu[]={0.65, 0.80};
		Perceptron_lib plib=new Perceptron_lib(2, nu, 0.01, 0.5);
		
		//�w�K�f�[�^
		double input[][]={{1,1},{1,0},{0,1},{0,0}};
		double output[]={1, 0, 0, 0};
		//�w�K
		int index;
		for(int i=0; i<150; i++){
			index=(int)(Math.random()*4); //0~3�̗�������
			plib.getParameter(input[index],  output[index]);
			System.out.println("index :"+i+"nu="+nu[0]+","+nu[1]);
		}
		//���ʊm�F
		for(int i=0; i<output.length; i++){
			if(plib.getOutput(input[i])==output[i])
				System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+")to output("+output[i]+")");
			else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+")to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+","+nu[1]);
		
	}

}
