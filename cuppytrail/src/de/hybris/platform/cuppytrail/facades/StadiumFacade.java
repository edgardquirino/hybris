package de.hybris.platform.cuppytrail.facades;

import de.hybris.platform.cuppytrail.data.StadiumData;

import java.util.List;

/**
 * Created by edgardquirino on 11/1/16.
 */
public interface StadiumFacade {

    StadiumData getStadium(String name);

    List<StadiumData> getStadiums();


}
