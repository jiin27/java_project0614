//java.exe�� ���� �ÿ��ϴ� ���ڸ� �Ű������� �ѱ��, �� �Ű������� �ش��ϴ� �������� ����Ͻÿ� 
class Test5{
	//main�� �����ڰ� ���� ȣ���� �Ұ��ϸ�, ���������� ȣ���� �� �ִµ�, 
	//�� ����� �ٷ� java.exe�� ���� ȣ��
	//java 6 -> 6�� ���
	public static void main(String[] args){
		//js������ parseInt() �����Լ��� ����������,
		//java������ Wrapper Ŭ������ �����Ѵ�.

		int n=Integer.parseInt(args[0]); //String �迭�̱� ������ "6"����. ���� �迭ó�� �� ����.
		
		for(int a=n; a>=1; a--){
			for(int i=1; i<=9; i++){
				System.out.println(a+"*"+i+"="+(a*i));
			}
		}
	}
	
}