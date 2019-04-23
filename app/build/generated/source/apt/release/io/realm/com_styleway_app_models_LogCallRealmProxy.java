package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_styleway_app_models_LogCallRealmProxy extends com.styleway.app.models.LogCall
    implements RealmObjectProxy, com_styleway_app_models_LogCallRealmProxyInterface {

    static final class LogCallColumnInfo extends ColumnInfo {
        long timeUpdatedIndex;
        long timeDurationSecondsIndex;
        long statusIndex;
        long myIdIndex;
        long userIdIndex;
        long userNameIndex;
        long userImageIndex;
        long userStatusIndex;
        long isVideoIndex;

        LogCallColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("LogCall");
            this.timeUpdatedIndex = addColumnDetails("timeUpdated", "timeUpdated", objectSchemaInfo);
            this.timeDurationSecondsIndex = addColumnDetails("timeDurationSeconds", "timeDurationSeconds", objectSchemaInfo);
            this.statusIndex = addColumnDetails("status", "status", objectSchemaInfo);
            this.myIdIndex = addColumnDetails("myId", "myId", objectSchemaInfo);
            this.userIdIndex = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.userNameIndex = addColumnDetails("userName", "userName", objectSchemaInfo);
            this.userImageIndex = addColumnDetails("userImage", "userImage", objectSchemaInfo);
            this.userStatusIndex = addColumnDetails("userStatus", "userStatus", objectSchemaInfo);
            this.isVideoIndex = addColumnDetails("isVideo", "isVideo", objectSchemaInfo);
        }

        LogCallColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new LogCallColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final LogCallColumnInfo src = (LogCallColumnInfo) rawSrc;
            final LogCallColumnInfo dst = (LogCallColumnInfo) rawDst;
            dst.timeUpdatedIndex = src.timeUpdatedIndex;
            dst.timeDurationSecondsIndex = src.timeDurationSecondsIndex;
            dst.statusIndex = src.statusIndex;
            dst.myIdIndex = src.myIdIndex;
            dst.userIdIndex = src.userIdIndex;
            dst.userNameIndex = src.userNameIndex;
            dst.userImageIndex = src.userImageIndex;
            dst.userStatusIndex = src.userStatusIndex;
            dst.isVideoIndex = src.isVideoIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private LogCallColumnInfo columnInfo;
    private ProxyState<com.styleway.app.models.LogCall> proxyState;

    com_styleway_app_models_LogCallRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (LogCallColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.styleway.app.models.LogCall>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timeUpdated() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timeUpdatedIndex);
    }

    @Override
    public void realmSet$timeUpdated(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeUpdatedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeUpdatedIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$timeDurationSeconds() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.timeDurationSecondsIndex);
    }

    @Override
    public void realmSet$timeDurationSeconds(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeDurationSecondsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeDurationSecondsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIndex);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.statusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$myId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.myIdIndex);
    }

    @Override
    public void realmSet$myId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.myIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.myIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.myIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.myIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userNameIndex);
    }

    @Override
    public void realmSet$userName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userImageIndex);
    }

    @Override
    public void realmSet$userImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userImageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userStatusIndex);
    }

    @Override
    public void realmSet$userStatus(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userStatusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userStatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userStatusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userStatusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isVideo() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isVideoIndex);
    }

    @Override
    public void realmSet$isVideo(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isVideoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isVideoIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("LogCall", 9, 0);
        builder.addPersistedProperty("timeUpdated", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("timeDurationSeconds", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("myId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userStatus", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isVideo", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static LogCallColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new LogCallColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "LogCall";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "LogCall";
    }

    @SuppressWarnings("cast")
    public static com.styleway.app.models.LogCall createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.styleway.app.models.LogCall obj = realm.createObjectInternal(com.styleway.app.models.LogCall.class, true, excludeFields);

        final com_styleway_app_models_LogCallRealmProxyInterface objProxy = (com_styleway_app_models_LogCallRealmProxyInterface) obj;
        if (json.has("timeUpdated")) {
            if (json.isNull("timeUpdated")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
            } else {
                objProxy.realmSet$timeUpdated((long) json.getLong("timeUpdated"));
            }
        }
        if (json.has("timeDurationSeconds")) {
            if (json.isNull("timeDurationSeconds")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeDurationSeconds' to null.");
            } else {
                objProxy.realmSet$timeDurationSeconds((int) json.getInt("timeDurationSeconds"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("myId")) {
            if (json.isNull("myId")) {
                objProxy.realmSet$myId(null);
            } else {
                objProxy.realmSet$myId((String) json.getString("myId"));
            }
        }
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("userName")) {
            if (json.isNull("userName")) {
                objProxy.realmSet$userName(null);
            } else {
                objProxy.realmSet$userName((String) json.getString("userName"));
            }
        }
        if (json.has("userImage")) {
            if (json.isNull("userImage")) {
                objProxy.realmSet$userImage(null);
            } else {
                objProxy.realmSet$userImage((String) json.getString("userImage"));
            }
        }
        if (json.has("userStatus")) {
            if (json.isNull("userStatus")) {
                objProxy.realmSet$userStatus(null);
            } else {
                objProxy.realmSet$userStatus((String) json.getString("userStatus"));
            }
        }
        if (json.has("isVideo")) {
            if (json.isNull("isVideo")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isVideo' to null.");
            } else {
                objProxy.realmSet$isVideo((boolean) json.getBoolean("isVideo"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.styleway.app.models.LogCall createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.styleway.app.models.LogCall obj = new com.styleway.app.models.LogCall();
        final com_styleway_app_models_LogCallRealmProxyInterface objProxy = (com_styleway_app_models_LogCallRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("timeUpdated")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeUpdated((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
                }
            } else if (name.equals("timeDurationSeconds")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeDurationSeconds((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeDurationSeconds' to null.");
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else if (name.equals("myId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$myId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$myId(null);
                }
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("userName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userName(null);
                }
            } else if (name.equals("userImage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userImage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userImage(null);
                }
            } else if (name.equals("userStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userStatus((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userStatus(null);
                }
            } else if (name.equals("isVideo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isVideo((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isVideo' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.styleway.app.models.LogCall copyOrUpdate(Realm realm, com.styleway.app.models.LogCall object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.styleway.app.models.LogCall) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.styleway.app.models.LogCall copy(Realm realm, com.styleway.app.models.LogCall newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.styleway.app.models.LogCall) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.styleway.app.models.LogCall realmObject = realm.createObjectInternal(com.styleway.app.models.LogCall.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_styleway_app_models_LogCallRealmProxyInterface realmObjectSource = (com_styleway_app_models_LogCallRealmProxyInterface) newObject;
        com_styleway_app_models_LogCallRealmProxyInterface realmObjectCopy = (com_styleway_app_models_LogCallRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$timeUpdated(realmObjectSource.realmGet$timeUpdated());
        realmObjectCopy.realmSet$timeDurationSeconds(realmObjectSource.realmGet$timeDurationSeconds());
        realmObjectCopy.realmSet$status(realmObjectSource.realmGet$status());
        realmObjectCopy.realmSet$myId(realmObjectSource.realmGet$myId());
        realmObjectCopy.realmSet$userId(realmObjectSource.realmGet$userId());
        realmObjectCopy.realmSet$userName(realmObjectSource.realmGet$userName());
        realmObjectCopy.realmSet$userImage(realmObjectSource.realmGet$userImage());
        realmObjectCopy.realmSet$userStatus(realmObjectSource.realmGet$userStatus());
        realmObjectCopy.realmSet$isVideo(realmObjectSource.realmGet$isVideo());
        return realmObject;
    }

    public static long insert(Realm realm, com.styleway.app.models.LogCall object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.LogCall.class);
        long tableNativePtr = table.getNativePtr();
        LogCallColumnInfo columnInfo = (LogCallColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.LogCall.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$timeUpdated(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeDurationSecondsIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$timeDurationSeconds(), false);
        String realmGet$status = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        }
        String realmGet$myId = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        }
        String realmGet$userId = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        }
        String realmGet$userName = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userName();
        if (realmGet$userName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
        }
        String realmGet$userImage = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userImage();
        if (realmGet$userImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
        }
        String realmGet$userStatus = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userStatus();
        if (realmGet$userStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userStatusIndex, rowIndex, realmGet$userStatus, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$isVideo(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.LogCall.class);
        long tableNativePtr = table.getNativePtr();
        LogCallColumnInfo columnInfo = (LogCallColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.LogCall.class);
        com.styleway.app.models.LogCall object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.LogCall) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$timeUpdated(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeDurationSecondsIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$timeDurationSeconds(), false);
            String realmGet$status = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            }
            String realmGet$myId = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            }
            String realmGet$userId = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            }
            String realmGet$userName = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userName();
            if (realmGet$userName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
            }
            String realmGet$userImage = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userImage();
            if (realmGet$userImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
            }
            String realmGet$userStatus = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userStatus();
            if (realmGet$userStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userStatusIndex, rowIndex, realmGet$userStatus, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$isVideo(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.styleway.app.models.LogCall object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.LogCall.class);
        long tableNativePtr = table.getNativePtr();
        LogCallColumnInfo columnInfo = (LogCallColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.LogCall.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$timeUpdated(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.timeDurationSecondsIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$timeDurationSeconds(), false);
        String realmGet$status = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
        }
        String realmGet$myId = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
        }
        String realmGet$userId = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        String realmGet$userName = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userName();
        if (realmGet$userName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userNameIndex, rowIndex, false);
        }
        String realmGet$userImage = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userImage();
        if (realmGet$userImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userImageIndex, rowIndex, false);
        }
        String realmGet$userStatus = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userStatus();
        if (realmGet$userStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userStatusIndex, rowIndex, realmGet$userStatus, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userStatusIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$isVideo(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.LogCall.class);
        long tableNativePtr = table.getNativePtr();
        LogCallColumnInfo columnInfo = (LogCallColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.LogCall.class);
        com.styleway.app.models.LogCall object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.LogCall) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$timeUpdated(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.timeDurationSecondsIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$timeDurationSeconds(), false);
            String realmGet$status = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
            }
            String realmGet$myId = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
            }
            String realmGet$userId = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
            }
            String realmGet$userName = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userName();
            if (realmGet$userName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userNameIndex, rowIndex, realmGet$userName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userNameIndex, rowIndex, false);
            }
            String realmGet$userImage = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userImage();
            if (realmGet$userImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userImageIndex, rowIndex, realmGet$userImage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userImageIndex, rowIndex, false);
            }
            String realmGet$userStatus = ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$userStatus();
            if (realmGet$userStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userStatusIndex, rowIndex, realmGet$userStatus, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userStatusIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoIndex, rowIndex, ((com_styleway_app_models_LogCallRealmProxyInterface) object).realmGet$isVideo(), false);
        }
    }

    public static com.styleway.app.models.LogCall createDetachedCopy(com.styleway.app.models.LogCall realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.styleway.app.models.LogCall unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.styleway.app.models.LogCall();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.styleway.app.models.LogCall) cachedObject.object;
            }
            unmanagedObject = (com.styleway.app.models.LogCall) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_styleway_app_models_LogCallRealmProxyInterface unmanagedCopy = (com_styleway_app_models_LogCallRealmProxyInterface) unmanagedObject;
        com_styleway_app_models_LogCallRealmProxyInterface realmSource = (com_styleway_app_models_LogCallRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$timeUpdated(realmSource.realmGet$timeUpdated());
        unmanagedCopy.realmSet$timeDurationSeconds(realmSource.realmGet$timeDurationSeconds());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$myId(realmSource.realmGet$myId());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$userName(realmSource.realmGet$userName());
        unmanagedCopy.realmSet$userImage(realmSource.realmGet$userImage());
        unmanagedCopy.realmSet$userStatus(realmSource.realmGet$userStatus());
        unmanagedCopy.realmSet$isVideo(realmSource.realmGet$isVideo());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("LogCall = proxy[");
        stringBuilder.append("{timeUpdated:");
        stringBuilder.append(realmGet$timeUpdated());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeDurationSeconds:");
        stringBuilder.append(realmGet$timeDurationSeconds());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{myId:");
        stringBuilder.append(realmGet$myId() != null ? realmGet$myId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userName:");
        stringBuilder.append(realmGet$userName() != null ? realmGet$userName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userImage:");
        stringBuilder.append(realmGet$userImage() != null ? realmGet$userImage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userStatus:");
        stringBuilder.append(realmGet$userStatus() != null ? realmGet$userStatus() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isVideo:");
        stringBuilder.append(realmGet$isVideo());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_styleway_app_models_LogCallRealmProxy aLogCall = (com_styleway_app_models_LogCallRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aLogCall.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aLogCall.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aLogCall.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
