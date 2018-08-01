class r2d {
	float rs,dollar;
	void convert(float rs){
		dollar = rs/60;
		System.out.println("Dollar is " +dollar);
}
	

}

class d2r {
	float rs,dollar;
	void convert(float dollar){
		rs = dollar * 60;
		System.out.println("Rs is " +rs);
}
		
}

class conversion {

	public static void main(String args[]){

		r2d r = new r2d();
		d2r d = new d2r();
		r.convert(120);
		d.convert(2);
}
}