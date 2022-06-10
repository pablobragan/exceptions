package org.pbragan.exceptions.examples.services;

import org.pbragan.exceptions.examples.model.BathContext;
import org.pbragan.exceptions.examples.services.exceptions.NoWaterException;

public interface BathroomService {

    BathContext openShowerFaucet() throws NoWaterException;
}
