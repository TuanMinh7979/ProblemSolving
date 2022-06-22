package Util;

import java.util.*;

public class JsonUtil {

    public static Map<String, Object> jsonToMap(Object json) throws JSONException {

        if (json instanceof JSONObject)
            return _jsonToMap_((JSONObject) json);

        else if (json instanceof String) {
            JSONObject jsonObject = new JSONObject((String) json);
            return _jsonToMap_(jsonObject);
        }
        return null;
    }


    private static Map<String, Object> _jsonToMap_(JSONObject json) throws JSONException {
        Map<String, Object> retMap = new HashMap<String, Object>();

        if (json != JSONObject.NULL) {
            retMap = toMap(json);
        }
        return retMap;
    }



    //sdjfnsanasgnsndjfngasjdfnnnnnnnnnnnnnnnnnnnnnnn
    private static Map<String, Object> toMap(JSONObject object) throws JSONException {
        Map<String, Object> map = new HashMap<String, Object>();

        Iterator<String> keysItr = object.keys();
        while (keysItr.hasNext()) {
            String key = keysItr.next();
            Object value = object.get(key);

            if (value instanceof JSONArray) {
                value = toList((JSONArray) value);
            } else if (value instanceof JSONObject) {
                value = toMap((JSONObject) value);
            }
            map.put(key, value);
        }
        return map;
    }

//1 delete by newbranch1
    //by newbranch1 added

    //3is this still in new pull from by newbranch1 update





}