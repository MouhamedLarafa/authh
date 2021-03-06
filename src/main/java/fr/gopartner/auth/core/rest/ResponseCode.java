package fr.gopartner.auth.core.rest;

import lombok.Getter;

@Getter
public enum ResponseCode {
    // edhouma les exception li bsh ykharejhom globalexceptionhandler

    ROLE_NOT_FOUND("ROLE NOT FOUND"),
    S_ROLE_DELETED("ROLE SUCCESSFULLY DELETED"),
    S_ROLE_UPDATED("ROLE SUCCESSFULLY UPDATED"),
    S_ROLE_CREATED("ROLE SUCCESSFULLY CREATED"),
    PERSON_NOT_FOUND("GROUP NOT FOUND"),
    S_PERSON_DELETED("GROUP SUCCESSFULLY DELETED"),
    S_PERSON_CREATED("GROUP SUCCESSFULLY CREATED"),
    S_PERSON_UPDATED("GROUP SUCCESSFULLY UPDATED"),
    ENTITY_NOT_FOUND("ENTITY NOT FOUND"),
    S_ENTITY_DELETED("ENTITY SUCCESSFULLY DELETED"),
    S_ENTITY_CREATED("ENTITY SUCCESSFULLY CREATED"),
    S_ENTITY_UPDATED("ENTITY SUCCESSFULLY UPDATED"),
    GROUP_NOT_FOUND("GROUP NOT FOUND"),
    S_GROUP_DELETED("GROUP SUCCESSFULLY DELETED"),
    S_GROUP_CREATED("GROUP SUCCESSFULLY CREATED"),
    S_GROUP_UPDATED("GROUP SUCCESSFULLY UPDATED"),
    JOB_NOT_FOUND("ENTITY NOT FOUND"),
    SERVER_GED_PROBLEME("SERVER GED PROBLEME"),
    PASSWORD_NOT_MATCH("ENTITY SUCCESSFULLY UPDATED"),
    S_JOB_DELETED("ENTITY SUCCESSFULLY DELETED"),
    S_JOB_CREATED("ENTITY SUCCESSFULLY CREATED"),
    TOKEN_NOT_FOUND("TOKEN NOT FOUND"),
    S_JOB_UPDATED("ENTITY SUCCESSFULLY UPDATED");
    private String message;
    ResponseCode(String message) {
        this.message = message;
    }

}
