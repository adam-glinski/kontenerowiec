package ppj08dod.kontenerowiec;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

enum ContainerSize{
    TWENTY,
    FORTY
}
enum ContainerType{
    /* Bananas */
    SEALED_NITROGEN_ATMOSPHERE,
    /* Quartz */
    BULK_CARGO,
    /* Electronics */
    GENERAL_PURPOSE,
    /* Juiced and chemicals: */
    TANK
}
class Container{
    double mWeight;
    ContainerType mType;
    ContainerSize mSize;
    Container(double weight, ContainerType type, ContainerSize size) {
        mWeight = weight;
        mType = type;
        mSize = size;
    }

    public String toString(){
        return mType + "\t" + mSize + "\t" + mWeight;
    }
}

class ContainerBay{
    final int MAX_ROWS = 22;
    final int MAX_TIERS = 10;
    ArrayList<ArrayList<Container>> mContainerCells = new ArrayList<Container>[MAX_ROWS][MAX_TIERS];
}

public class ContainerCarrier{
    static final int MAX_CONTAINERS = 15_000;
    static final int MAX_BAYS = 23;
//    static ArrayList<ContainerBay> mContainerBays = new ArrayList<ContainerBay>(MAX_BAYS);
    static List<ContainerBay> mContainerBays = Arrays.asList(new ContainerBay[MAX_BAYS]);
    public static void main(String[] args) {
        Container sampleContainer = new Container(1500.d, ContainerType.SEALED_NITROGEN_ATMOSPHERE, ContainerSize.TWENTY);
        System.out.println(sampleContainer);
    }
}
