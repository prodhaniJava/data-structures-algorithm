/**
 *
 */


import java.util.Map;


/**
 * Payment mode details populated to this result object.
 *
 * @author rezaul.prodhani
 *
 */
public class LMGPaymentOptionResult
{

	Map<String, String> creditcard;
	Map<String, String> debitcard;
	Map<String, String> netbanking;
	Map<String, String> cashcard;
	Map<String, String> upi;

	public Map<String, String> getCreditcard()
	{
		return creditcard;
	}

	public Map<String, String> getDebitcard()
	{
		return debitcard;
	}

	public void setCreditcard(final Map<String, String> creditcard)
	{
		this.creditcard = creditcard;
	}

	public void setDebitcard(final Map<String, String> debitcard)
	{
		this.debitcard = debitcard;
	}

	public Map<String, String> getNetbanking()
	{
		return netbanking;
	}

	public void setNetbanking(final Map<String, String> netbanking)
	{
		this.netbanking = netbanking;
	}

	public Map<String, String> getCashcard()
	{
		return cashcard;
	}

	public Map<String, String> getUpi()
	{
		return upi;
	}

	public void setCashcard(final Map<String, String> cashcard)
	{
		this.cashcard = cashcard;
	}

	public void setUpi(final Map<String, String> upi)
	{
		this.upi = upi;
	}

	@Override
	public String toString()
	{
		return "LMGPaymentModeResult [creditcard=" + creditcard + ", debitcard=" + debitcard + ", netbanking=" + netbanking
				+ ", cashcard=" + cashcard + ", upi=" + upi + "]";
	}
	
}
