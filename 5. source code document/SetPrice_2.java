
public class SetPrice_2 extends SetPrice{
	public void setPrice(DataStore d, int g){
		if (g == 1)
			d.setPrice(d.getA());
		if (g == 2)
			d.setPrice(d.getB());
	}
}
