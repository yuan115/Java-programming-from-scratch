package yuan;

public class json_string_handling {
	
	public static void main(String[] args) {
		String json = "[{\"animal_id\":\"10305240201056\",\"animal_kind\":\"��\",\"animal_sex\":\"F\",\"shelter_name\":\"�O�_���ʪ����a\"},"
				+ "{\"animal_id\":\"10508011005002\",\"animal_kind\":\"��\",\"animal_sex\":\"F\",\"shelter_name\":\"�O�������~�ʪ���|\"}]";
		String[] cat = new String[4];
		String[] dog = new String[4];
		
		json = json.replace("[", "").replace("]", "");
		String catData = json.substring(json.indexOf("{"),json.indexOf("}")+1);
		String tmp = catData.replace("{", "").replace("}","");
		cat = tmp.split(",");
		
		String dogData = json.replace(catData+",", "");
		dogData = dogData.replace("{", "").replace("}","");
		dog = dogData.split(",");
		
		System.out.println(json);
		System.out.println(catData);
		System.out.println(dogData);
		System.out.println(cat[3]);
		System.out.println(dog[3]);
	}


}
