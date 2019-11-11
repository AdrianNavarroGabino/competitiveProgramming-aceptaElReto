// Adrián Navarro Gabino

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class ChasingDrDeathComparator implements Comparator<Magic>
{

    @Override
    public int compare(Magic m1, Magic m2) {
        if(m1.getInnocentDamage() < m2.getInnocentDamage())
        {
            return -1;
        }
        else if(m1.getInnocentDamage() == m2.getInnocentDamage())
        {
            if(m1.getVillainDamage() < m2.getVillainDamage())
            {
                return 1;
            }
            else if(m1.getVillainDamage() == m2.getVillainDamage())
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        
        return 1;
    }
}

class Magic {
    protected int innocentDamage;
    protected int villainDamage;
    protected int pos;

    public void setInnocentDamage(int innocentDamage) {
        this.innocentDamage = innocentDamage;
    }

    public void setVillainDamage(int villainDamage) {
        this.villainDamage = villainDamage;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getInnocentDamage() {
        return innocentDamage;
    }

    public int getVillainDamage() {
        return villainDamage;
    }

    public int getPos() {
        return pos;
    }

    public Magic() {
    }
}

public class Challenge0477 {

    public static void main(String[] args) {
        
        int i, villainTotalDamage, currentVillainDamage, numberOfMagic,
            innocentDamageInput, villainDamageInput;
        String result;
        
        Scanner sc = new Scanner(System.in);

        do
        {
            villainTotalDamage = sc.nextInt();
            sc.nextLine();
            if (villainTotalDamage > 0)
            {
                result = "";
                numberOfMagic = sc.nextInt();
                sc.nextLine();
                Magic[] magicList = new Magic[numberOfMagic];
                
                for (i = 0; i < numberOfMagic; i++)
                {
                    magicList[i] = new Magic();
                    
                    innocentDamageInput = sc.nextInt();
                    villainDamageInput = sc.nextInt();
                    sc.nextLine();
                    
                    magicList[i].setInnocentDamage(innocentDamageInput);
                    magicList[i].setVillainDamage(villainDamageInput);
                    magicList[i].pos = i+1;
                }
                
                Arrays.sort(magicList, new ChasingDrDeathComparator());
                
                i = 0;
                currentVillainDamage = villainTotalDamage;
                while (currentVillainDamage > 0 && i < numberOfMagic)
                {
                    if (result == "")				
                        result += "" + magicList[i].getPos();
                    else
                        result += " " + magicList[i].getPos();
                    currentVillainDamage -=
                                            magicList[i].getVillainDamage();
                    i++;
                }

                if (currentVillainDamage <= 0)
                    System.out.println(result);
                else
                    System.out.println("MUERTE ESCAPA");
                            
            }
        } while (villainTotalDamage > 0);
    }
}
