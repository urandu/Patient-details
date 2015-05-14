/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.patientdetails.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Encounter;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * The main controller.
 */
@Controller
public class  patientdetailsEncounterController {

    protected final Log log = LogFactory.getLog(getClass());

    @RequestMapping(value = "/module/patientdetails/encounter", method = RequestMethod.GET)
    public void manage(ModelMap model,@RequestParam(required = false, value="patientId") Integer ptId)
    {
       // List<Allergy> allAllergies=Context.getActiveListService().getActiveListItems(Context.getPatientService().getPatient(ptId),Allergy);
        List<Encounter> encountersForPatients = Context.getEncounterService().getEncountersByPatient(Context.getPatientService().getPatient(ptId));
        model.addAttribute("allEncounters", encountersForPatients);

    }
}
