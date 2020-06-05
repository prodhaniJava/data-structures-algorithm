import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;


public class JSON {

	static String json1 = "[{\"id\":\"2\",\"name\":\"rez\" ," + " \"emiPlan\" :[" + "{\"rt\":\"3\",\"amount\":\"200\"},"
			+ "{\"rt\":\"4\",\"amount\":\"300\"}] }," + "{\"id\":\"32\",\"name\":\"re33z\" ," + "\"emiPlan\" :["
			+ "{\"rt\":\"6\",\"amount\":\"800\"}," + "{\"rt\":\"5\",\"amount\":\"400\"}" + "]}]";
	
	static String json2 = "{\"7\":{\"EMIA3\":{\"transactionAmount\":10000000000,\"paybackAmount\":0},\"EMIA6\":{\"transactionAmount\":10000000000,\"paybackAmount\":0}},\"KOTAK\":{\"EMIK3\":{\"transactionAmount\":10000000000,\"paybackAmount\":0},\"EMIK6\":{\"transactionAmount\":10000000000,\"paybackAmount\":0}}}";
	static String json3 ="{\"emi\":{\"EMIA3\":\"AXIS - 3 months\",\"EMIK3\":\"KOTAK - 3 Months\",\"EMIA6\":\"AXIS - 6 months\",\"EMIK6\":\"KOTAK - 6 Months\",\"EMIA9\":\"AXIS - 9 months\",\"EMIK9\":\"KOTAK - 9 Months\"},\"netbanking\":{\"AXIB\":\"AXIS Bank NetBanking\"},\"creditcard\":{\"CC\":\"Credit Card\"},\"cashcard\":{\"FREC\":\"FreeCharge\",\"OLAM\":\"OlaMoney(Postpaid+Wallet)\"},\"debitcard\":{\"MAST\":\"MasterCard Debit Cards\",\"MAES\":\"Other Maestro Cards\",\"VISA\":\"Visa Debit Cards\"},\"upi\":{\"UPI\":\"UPI(AXIS Bank)\"}}";
    static String json4 = "{\"status\":1,\"msg\":\"1 out of 1 Transactions Fetched Successfully\",\"transaction_details\":{\"3400179000\":{\"mihpayid\":\"403993715520858673\",\"bank_ref_num\":\"8408857402676707248980\",\"amt\":\"849.00\"}}}";
	
    public static void main(String[] args) {
//		System.out.println("96 months".substring(0,1));
		Gson gson = new Gson();
//		LMGPaymentOptionResult map = gson.fromJson(json3, LMGPaymentOptionResult.class);
////		gson.
//		JsonParser parser = new JsonParser();
////
////
//		JsonElement jsonTree = parser.parse(json2);
//		JsonObject jsonObject = jsonTree.getAsJsonObject();
//		Set<Entry<String, JsonElement>>   entrySet =jsonObject.entrySet();
//		for(Entry<String, JsonElement>  entry   : entrySet){
//			System.out.println(entry.getKey());
//			JsonElement  element= entry.getValue();
//			JsonObject object = element.getAsJsonObject();
//			Set<Entry<String, JsonElement>>   emitSet =object.entrySet();
//			for(Entry<String, JsonElement>  emi   : emitSet){
//				System.out.println(emi.getKey());
//				JsonElement  install= emi.getValue();
//				JsonObject monthInst = install.getAsJsonObject();
//				System.out.println(monthInst.get("transactionAmount").getAsDouble());
//			}
//			
//		}
//
//	
//				
//		Person[] list = gson.fromJson(json1, Person[].class);
//		for (Person p : list) {
//			System.out.println(p);
//			System.out.println(p.getEmiPlan().get(0));
//			String personStr = String.valueOf(p);
//			System.out.println(personStr);
//		}
		
//		Payment payment = gson.fromJson(json4, Payment.class);
//		System.out.println(payment);
		
		
//		String json = "[{\"status\":1,\"msg\":\"one\"},{\"status\":1,\"msg\":\"one\"}]";
//		Type targetClassType = new TypeToken<ArrayList<Payment>>() { }.getType();
//		Collection<Payment> targetCollection = new Gson().fromJson(json, targetClassType);
//		System.out.println(targetCollection);
		
		
		String json = "{\"7\":{\"EMIA3\":{\"status\":\"500\",\"msg\":\"0\"},\"EMIA6\":{\"status\":\"500\",\"msg\":\"0\"}},\"KOTAK\":{\"EMIK3\":{\"status\":\"500\",\"msg\":\"0\"},\"EMIK6\":{\"status\":\"500\",\"msg\":\"0\"}}}";
		
		System.out.println("json "+json);

		Map<String, Map<String, Bank>> emiPlanMap =  new HashMap<>();
		Type targetClassType = new TypeToken<Map<String, Map<String, Bank>>>() { }.getType();
		emiPlanMap = new Gson().fromJson(json,targetClassType);
		int i =1;
		for(Entry<String, Map<String, Bank>> entrySet:emiPlanMap.entrySet()){
			System.out.println("bank name "+entrySet.getKey() );
			for(Entry<String, Bank> emi:entrySet.getValue().entrySet()){
				System.out.println("emi id "+emi +" "+emi.getValue());
			}
			System.out.println(entrySet.toString() );
			System.out.println(" i "+i++);
		}
	}

	
}

class Person {
	private String id;
	@SerializedName(value = "name")
	private String name1;
	private List<EmiPlan> emiPlan;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name) {
		this.name1 = name;
	}

	public List<EmiPlan> getEmiPlan() {
		return emiPlan;
	}

	public void setEmiPlan(List<EmiPlan> emiPlan) {
		this.emiPlan = emiPlan;
	}

//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name1=" + name1 + ", emiPlan=" + emiPlan + "]";
//	}

}

class EmiPlan {
	private int rt;
	private int amount;

	public int getRt() {
		return rt;
	}

	public void setRt(int rt) {
		this.rt = rt;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "EmiPlan [rt=" + rt + ", amount=" + amount + "]";
	}

}

class Payment {
	int status;
	String msg;
	Map<String, Transaction> transaction_details = new HashMap<>();
	
}
class Bank {
	int status;
	String msg;
	@Override
	public String toString() {
		return "Bank [status=" + status + ", msg=" + msg + "]";
	}
	
	
}
class Transaction {
	String mihpayid;
	String bank_ref_num;
	String amt;
	

}
