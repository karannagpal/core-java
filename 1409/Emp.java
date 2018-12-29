package pkg1409;

/**
 *
 * @author HP
 */
public class Emp {
    int id, bsal; 
    double hra, da, epf, net;
    String name;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getBsal()
    {
        return bsal;
    }

    public void setBsal(int bsal)
    {
        this.bsal = bsal;
    }

    public double getHra()
    {
        return hra;
    }

    public void setHra()
    {
        this.hra = bsal * 0.09;
    }

    public double getDa()
    {
        return da;
    }

    public void setDa()
    {
        this.da = bsal * 0.11;
    }

    public double getEpf()
    {
        return epf;
    }

    public void setEpf()
    {
        this.epf = bsal * 0.1;
    }

    public double getNet()
    {
        return net;
    }

    public void setNet()
    {
        this.net = bsal + hra + da - epf;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    
    
}
