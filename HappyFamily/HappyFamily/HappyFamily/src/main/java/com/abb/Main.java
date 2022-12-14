package com.abb;

import com.abb.model.Family;
import com.abb.model.Human;
import com.abb.service.FamilyService;

public class Main
{
    private static final FamilyService familyService = new FamilyService();

    private static final Human father1 = new Human("Tom", "Carlson", "10/09/1971", 70);
    private static final Human father2 = new Human("Noah", "Jackson", "10/08/1973", 75);
    private static final Human mother1 = new Human("Olivia", "Carlson", "10/09/1974", 78);
    private static final Human mother2 = new Human("Sophia", "Jackson", "10/09/1980", 70);
    private static final Human child1 = new Human("Emma", "Jackson", "10/09/2000", 89);
    private static final Human child2 = new Human("Olivier", "Jackson", "10/09/2005", 70);
    private static final Human child3 = new Human("Amelia", "Carlson", "10/09/2004", 78);
    private static final Human child4 = new Human("James", "Carlson", "10/09/2001", 79);
    private static final Human child5 = new Human("Lucas", "Carlson", "10/09/2001", 77);
    private static final Human child6 = new Human("Jake", "Jackson", "10/09/2003", 76);
    private static final Family family1 = new Family(mother1, father1);
    private static final Family family2 = new Family(mother2, father2);

    public static void main (String[] args)
    {
        family2.addChild(child1);
        family2.addChild(child2);
        family1.addChild(child3);
        family1.addChild(child4);
        family1.addChild(child5);
        familyService.getAllFamilies().clear();

        familyService.getAllFamilies().add(family1);
        familyService.getAllFamilies().add(family2);
    }
}