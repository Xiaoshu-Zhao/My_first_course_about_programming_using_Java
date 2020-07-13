public class ListElem
{
  private String data;
  private ListElem next;

  public ListElem()
  {
    this( null, null );
  }

  public ListElem(String data)
  {
    this( data, null );
  }

  public ListElem(String data, ListElem next)
  {
    setData( data );
    setNext( next );
  }

  public String getData()
  {
    return data;
  }

  public ListElem getNext()
  {
    return next;
  }

  public void setData(String data)
  {
     this.data = data;
  }

  public void setNext(ListElem next)
  {
    this.next = next;
  }
  public String toString()
  {
	  return "" + getData();
  }  
} //END ListElem CLASS