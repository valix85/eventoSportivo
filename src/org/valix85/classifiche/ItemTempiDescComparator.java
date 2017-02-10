package org.valix85.classifiche;

import java.util.Comparator;

/**
 * Created by Valerio on 10/02/2017.
 */
public class ItemTempiDescComparator implements Comparator<ItemTempi> {
    @Override
    public int compare(ItemTempi it1, ItemTempi it2){
        return (int) (it2.getPunteggio()-it1.getPunteggio());
    }
}
