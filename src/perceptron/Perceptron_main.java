//nuの初期値が0.5以下だと学習回数によらず最初から正しい判定が行えて、
//今のように0.65と0.80を初期値に置くと、学習回数が大体100前後で正しい判定が行え、150あれば十分であることがわかった。
//nuの初期値が大きいほど必要な学習回数が増える。
package perceptron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nu[]={0.65, 0.80};
		Perceptron_lib plib=new Perceptron_lib(2, nu, 0.01, 0.5);
		
		//学習データ
		double input[][]={{1,1},{1,0},{0,1},{0,0}};
		double output[]={1, 0, 0, 0};
		//学習
		int index;
		for(int i=0; i<150; i++){
			index=(int)(Math.random()*4); //0~3の乱数発生
			plib.getParameter(input[index],  output[index]);
			System.out.println("index :"+i+"nu="+nu[0]+","+nu[1]);
		}
		//結果確認
		for(int i=0; i<output.length; i++){
			if(plib.getOutput(input[i])==output[i])
				System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+")to output("+output[i]+")");
			else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+")to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+","+nu[1]);
		
	}

}
