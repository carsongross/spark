package spark;

/**
 * Created by carson on 6/15/16.
 */
public class TemplateArg
{
  private final String _name;
  private final Object _val;

  public TemplateArg( String name, Object val )
  {
    _name = name;
    _val = val;
  }

  public String getName()
  {
    return _name;
  }

  public Object getVal()
  {
    return _val;
  }
}

