package panCardMock;

import org.mockito.Mockito;

class PANCard{
	public  String isvalid(String pancard) {
		if(pancard.matches("[A-Z]{5}[0-9]{4}[A-Z]")==true) {
			return "it is valid pancard";
		}
		else {
			return "it is not valid pancard";
		}
	}
	public static PANCard getMockObj() {
	PANCard mockObj = Mockito.mock(PANCard.class);
	
	Mockito.when(mockObj.isvalid("ASDEF7894U")).thenReturn("valid PAN card");
	Mockito.when(mockObj.isvalid("ABCDE6373M")).thenReturn("valid PAN card");
	Mockito.when(mockObj.isvalid("QWERF6472L")).thenReturn("valid PAN card");
	
	return mockObj;	
	}
}
class MockingTest {

	public static void main(String[] args) {
		//System.out.println(PANCard.isvalid("ASDEF59578K"));
		PANCard obj = PANCard.getMockObj();
		System.out.println(obj.isvalid("ASDEF7894U"));
	}
}
