//Other package
package pk2;
class OtherPackage 
{
	OtherPackage(){
	pk1.Protection p = new pk1.Protection();
	System.out.println("other package constructor");
	//  System.out.println("n = " + p.n);
	//  System.out.println("n_pri = " + p.n_pri);
	//  System.out.println("n_pro = " + p.n_pro);
	System.out.println("n_pub = " + p.n_pub);
	}
}