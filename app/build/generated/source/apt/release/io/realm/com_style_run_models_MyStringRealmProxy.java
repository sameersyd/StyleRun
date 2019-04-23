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
public class com_style_run_models_MyStringRealmProxy extends com.styleway.app.models.MyString
    implements RealmObjectProxy, com_style_run_models_MyStringRealmProxyInterface {

    static final class MyStringColumnInfo extends ColumnInfo {
        long stringIndex;

        MyStringColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MyString");
            this.stringIndex = addColumnDetails("string", "string", objectSchemaInfo);
        }

        MyStringColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MyStringColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MyStringColumnInfo src = (MyStringColumnInfo) rawSrc;
            final MyStringColumnInfo dst = (MyStringColumnInfo) rawDst;
            dst.stringIndex = src.stringIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MyStringColumnInfo columnInfo;
    private ProxyState<com.styleway.app.models.MyString> proxyState;

    com_style_run_models_MyStringRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MyStringColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.styleway.app.models.MyString>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$string() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.stringIndex);
    }

    @Override
    public void realmSet$string(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.stringIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.stringIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.stringIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.stringIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MyString", 1, 0);
        builder.addPersistedProperty("string", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MyStringColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MyStringColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MyString";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MyString";
    }

    @SuppressWarnings("cast")
    public static com.styleway.app.models.MyString createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.styleway.app.models.MyString obj = realm.createObjectInternal(com.styleway.app.models.MyString.class, true, excludeFields);

        final com_style_run_models_MyStringRealmProxyInterface objProxy = (com_style_run_models_MyStringRealmProxyInterface) obj;
        if (json.has("string")) {
            if (json.isNull("string")) {
                objProxy.realmSet$string(null);
            } else {
                objProxy.realmSet$string((String) json.getString("string"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.styleway.app.models.MyString createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.styleway.app.models.MyString obj = new com.styleway.app.models.MyString();
        final com_style_run_models_MyStringRealmProxyInterface objProxy = (com_style_run_models_MyStringRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("string")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$string((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$string(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.styleway.app.models.MyString copyOrUpdate(Realm realm, com.styleway.app.models.MyString object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.styleway.app.models.MyString) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.styleway.app.models.MyString copy(Realm realm, com.styleway.app.models.MyString newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.styleway.app.models.MyString) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.styleway.app.models.MyString realmObject = realm.createObjectInternal(com.styleway.app.models.MyString.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_style_run_models_MyStringRealmProxyInterface realmObjectSource = (com_style_run_models_MyStringRealmProxyInterface) newObject;
        com_style_run_models_MyStringRealmProxyInterface realmObjectCopy = (com_style_run_models_MyStringRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$string(realmObjectSource.realmGet$string());
        return realmObject;
    }

    public static long insert(Realm realm, com.styleway.app.models.MyString object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.MyString.class);
        long tableNativePtr = table.getNativePtr();
        MyStringColumnInfo columnInfo = (MyStringColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.MyString.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$string = ((com_style_run_models_MyStringRealmProxyInterface) object).realmGet$string();
        if (realmGet$string != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.stringIndex, rowIndex, realmGet$string, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.MyString.class);
        long tableNativePtr = table.getNativePtr();
        MyStringColumnInfo columnInfo = (MyStringColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.MyString.class);
        com.styleway.app.models.MyString object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.MyString) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$string = ((com_style_run_models_MyStringRealmProxyInterface) object).realmGet$string();
            if (realmGet$string != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.stringIndex, rowIndex, realmGet$string, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.styleway.app.models.MyString object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.MyString.class);
        long tableNativePtr = table.getNativePtr();
        MyStringColumnInfo columnInfo = (MyStringColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.MyString.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$string = ((com_style_run_models_MyStringRealmProxyInterface) object).realmGet$string();
        if (realmGet$string != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.stringIndex, rowIndex, realmGet$string, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.stringIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.MyString.class);
        long tableNativePtr = table.getNativePtr();
        MyStringColumnInfo columnInfo = (MyStringColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.MyString.class);
        com.styleway.app.models.MyString object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.MyString) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$string = ((com_style_run_models_MyStringRealmProxyInterface) object).realmGet$string();
            if (realmGet$string != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.stringIndex, rowIndex, realmGet$string, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.stringIndex, rowIndex, false);
            }
        }
    }

    public static com.styleway.app.models.MyString createDetachedCopy(com.styleway.app.models.MyString realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.styleway.app.models.MyString unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.styleway.app.models.MyString();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.styleway.app.models.MyString) cachedObject.object;
            }
            unmanagedObject = (com.styleway.app.models.MyString) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_style_run_models_MyStringRealmProxyInterface unmanagedCopy = (com_style_run_models_MyStringRealmProxyInterface) unmanagedObject;
        com_style_run_models_MyStringRealmProxyInterface realmSource = (com_style_run_models_MyStringRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$string(realmSource.realmGet$string());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MyString = proxy[");
        stringBuilder.append("{string:");
        stringBuilder.append(realmGet$string() != null ? realmGet$string() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}
