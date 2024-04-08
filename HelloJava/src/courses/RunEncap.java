package courses;

public class RunEncap {

	public static void main(String[] args) {
		EncapTest Encap = new EncapTest();
		
		Encap.setName("Mohamed");
		Encap.setAge(31);
		Encap.setIdNum(293);
		
		System.out.println(Encap.getName() + "\n" + Encap.getAge() +"\n"+ Encap.getIdNum());
		
	}

}
