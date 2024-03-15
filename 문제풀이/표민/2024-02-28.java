public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product("새우깡", "농심(주)", 1900);
		Product product1 = new Product("빼빼로", "롯데제과", 2200);
		Product product2 = new Product("먹태깡", "농심(주)", 2500);
		
		List<Product> list = new ArrayList<>();
		list.add(product);
		list.add(product1);
		list.add(product2);
		
		
		try {
			for(int i=1200; i<1200 + Product.getCount(list.size()); i++) {
				System.out.println(i + "\t" + list.get(i-1200).getmName() + "\t" + list.get(i-1200).getmWhere() + "\t"
						+ list.get(i-1200).getmPrice()+"원");
			}
			System.out.println();
			
			System.out.println("출고 상품 : " + Product.getCount(list.size()));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

===============================================================================================
<Product 클래스>
public class Product {
	
	private int mNum = 0; //상품번호
	private int mPrice = 0; // 가격
	private String mName = null; //상품명
	private String mWhere = "";
	
	
	private static int count = 0; //출고상품 횟수
	
	//생성자
	public Product(String product, String com, int price) {
		this.mName = product;
		this.mWhere = com;
		this.mPrice = price;
	}
	
	public static int getCount(int count) {
		
		return count;
		
	}

	public int getmPrice() {
		return mPrice;
	}

	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmWhere() {
		return mWhere;
	}

	public void setmWhere(String mWhere) {
		this.mWhere = mWhere;
	}
	
	//getter, setter

}
