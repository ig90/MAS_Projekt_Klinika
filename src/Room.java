
public abstract class Room {
	
	public int room_no;
	public int floor_no;
	public int area;
	public String bathroom;
		
		public Room(int room_no, int floor_no, int area, String bathroom){
			this.room_no=room_no;
			this.floor_no=floor_no;
			this.area=area;
			this.bathroom=bathroom;
		}		

		public Room(int room_no, int floor_no, int area){
			this.room_no=room_no;
			this.floor_no=floor_no;
			this.area=area;
		 
		}		
}
