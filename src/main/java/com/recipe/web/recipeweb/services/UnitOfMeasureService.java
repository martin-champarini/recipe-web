package com.recipe.web.recipeweb.services;


import com.recipe.web.recipeweb.commands.UnitOfMeasureCommand;

import java.util.Set;


public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
