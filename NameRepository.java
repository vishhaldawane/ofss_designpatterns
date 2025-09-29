
//THE WATER BOTTLE
public class NameRepository implements MyContainer // WaterBottle
{
	//CONTENT OF THE WATER BOTTLE 
	public String names[] = {"Aman" , "Ashutosh" ,"Prashant" , "Swapnil","Kundan","Utkarsh","Nikit","Murli","Harshal","Vishhal"};

	
	public MyIterator getMyIterator() {

		return new MyNameIterator();
	}
	
	//container implementing the iterator | STRAW IMPLEMENTATION
	private class MyNameIterator implements MyIterator //BuiltIn Straw in It
	{
		int index;

		public boolean hasNext() // name of this method remains fixed
		{
			if(index < names.length) //but the content will change
			{
	            return true;
	        }
	        return false;
		}

		public Object next() //but the content will change
		{
			 if(this.hasNext())
			 {
		            return names[index++];
		     }
		     return null;
		}
	}
}
