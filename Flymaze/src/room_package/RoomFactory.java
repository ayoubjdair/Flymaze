package room_package;

public class RoomFactory {

	public Room getRoom(String roomType) {
		
		if(roomType == null) {
			return null;
		}
		
		if(roomType == "STANDARD ROOM") {
			return new StandardRoom();
		}
		
		if(roomType == "BOSS ROOM") {
			return new BossRoom();
		}
		
		return null;
	}
}
