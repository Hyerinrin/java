package reference;

public class ArrayEx09 {

	public static void main(String[] args) {
		// 마방진
		int[][] magic = new int[3][3];
		int row = 0; //행
		int col; //열
		int num = 1; //넣을 숫자
		
		//첫행의 중간열에 1을 넣는다.
		col = magic[0].length/2;
		magic[row][col] = num;
		
		for(num =2; num<=magic.length*magic[0].length; num++) {
			//오른쪽 대각선 위로 이동한다
			row --;
			col ++;
			//행, 열 모두 존재하지 않으면 -> 행은 두칸 아래, 열은 한 칸 앞
			if(row<0 && col == magic[0].length) {
				row +=2;
				col--;
			}
			//행이 존재하지 않으면 -> 마지막 행으로 이동
			if(row<0) {
				row = magic.length-1;
			}
			//열이 존재하지 않으면 -> 첫 열로 이동
			if(col == magic[0].length) {
				col=0;
			}
			//이미 값이 존재하면 -> 행은 아래로 두칸, 열은 한 칸 앞으로
			if(magic[row][col] !=0) {
				row += 2;
				col--;
			}
			
			//값을 넣는다.
			magic[row][col] = num;
		}
		for(int i=0; i<magic.length;i++) {
			for(int j=0; j<magic.length;j++) {
				System.out.print(magic[i][j] + " ");
			}
			System.out.println();
		}

	}

}

/*<<에러 발생 : 인덱스가 범위를 벗어남>>
 * 
 * 두 가지 조건을 묻는 조건문은 가장 먼저 물어봐야 한다.(여러 가지 조건을 묻는 조건문도...) 
 * 
 * 
 * */




