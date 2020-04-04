package ioex;

import java.util.List;

class Item {
	String airlineNm;
	String arrAirportNm;
	long arrPlandTime;
	String depAirportNm;
	long depPlandTime;
	Integer economyCharge;
	Integer prestigeCharge;
	String vihicleId;
}

class Items{
	List<Item> item;
}

class Body {
	Items items;
	Integer numOfRows;
	Integer pageNo;
	Integer totalCount;
}

class Header{
	String resultCode;
	String resultMsg;
}

class Response {
	Header header;
	Body body;
}

public class AirplaneData {
	Response response;
}
