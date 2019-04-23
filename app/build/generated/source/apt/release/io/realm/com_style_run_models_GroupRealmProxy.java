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
public class com_style_run_models_GroupRealmProxy extends com.styleway.app.models.Group
    implements RealmObjectProxy, com_style_run_models_GroupRealmProxyInterface {

    static final class GroupColumnInfo extends ColumnInfo {
        long idIndex;
        long nameIndex;
        long statusIndex;
        long imageIndex;
        long userIdsIndex;

        GroupColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Group");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.statusIndex = addColumnDetails("status", "status", objectSchemaInfo);
            this.imageIndex = addColumnDetails("image", "image", objectSchemaInfo);
            this.userIdsIndex = addColumnDetails("userIds", "userIds", objectSchemaInfo);
        }

        GroupColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GroupColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GroupColumnInfo src = (GroupColumnInfo) rawSrc;
            final GroupColumnInfo dst = (GroupColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.statusIndex = src.statusIndex;
            dst.imageIndex = src.imageIndex;
            dst.userIdsIndex = src.userIdsIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GroupColumnInfo columnInfo;
    private ProxyState<com.styleway.app.models.Group> proxyState;
    private RealmList<com.styleway.app.models.MyString> userIdsRealmList;

    com_style_run_models_GroupRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GroupColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.styleway.app.models.Group>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
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
    public String realmGet$image() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imageIndex);
    }

    @Override
    public void realmSet$image(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.imageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imageIndex, value);
    }

    @Override
    public RealmList<com.styleway.app.models.MyString> realmGet$userIds() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (userIdsRealmList != null) {
            return userIdsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.userIdsIndex);
            userIdsRealmList = new RealmList<com.styleway.app.models.MyString>(com.styleway.app.models.MyString.class, osList, proxyState.getRealm$realm());
            return userIdsRealmList;
        }
    }

    @Override
    public void realmSet$userIds(RealmList<com.styleway.app.models.MyString> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("userIds")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.styleway.app.models.MyString> original = value;
                value = new RealmList<com.styleway.app.models.MyString>();
                for (com.styleway.app.models.MyString item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.userIdsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.styleway.app.models.MyString linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.styleway.app.models.MyString linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Group", 5, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("image", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("userIds", RealmFieldType.LIST, "MyString");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GroupColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GroupColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Group";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Group";
    }

    @SuppressWarnings("cast")
    public static com.styleway.app.models.Group createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.styleway.app.models.Group obj = null;
        if (update) {
            Table table = realm.getTable(com.styleway.app.models.Group.class);
            GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Group.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.styleway.app.models.Group.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_style_run_models_GroupRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("userIds")) {
                excludeFields.add("userIds");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_style_run_models_GroupRealmProxy) realm.createObjectInternal(com.styleway.app.models.Group.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_style_run_models_GroupRealmProxy) realm.createObjectInternal(com.styleway.app.models.Group.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_style_run_models_GroupRealmProxyInterface objProxy = (com_style_run_models_GroupRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("image")) {
            if (json.isNull("image")) {
                objProxy.realmSet$image(null);
            } else {
                objProxy.realmSet$image((String) json.getString("image"));
            }
        }
        if (json.has("userIds")) {
            if (json.isNull("userIds")) {
                objProxy.realmSet$userIds(null);
            } else {
                objProxy.realmGet$userIds().clear();
                JSONArray array = json.getJSONArray("userIds");
                for (int i = 0; i < array.length(); i++) {
                    com.styleway.app.models.MyString item = com_style_run_models_MyStringRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$userIds().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.styleway.app.models.Group createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.styleway.app.models.Group obj = new com.styleway.app.models.Group();
        final com_style_run_models_GroupRealmProxyInterface objProxy = (com_style_run_models_GroupRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else if (name.equals("image")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$image((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$image(null);
                }
            } else if (name.equals("userIds")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$userIds(null);
                } else {
                    objProxy.realmSet$userIds(new RealmList<com.styleway.app.models.MyString>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.styleway.app.models.MyString item = com_style_run_models_MyStringRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$userIds().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.styleway.app.models.Group copyOrUpdate(Realm realm, com.styleway.app.models.Group object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.styleway.app.models.Group) cachedRealmObject;
        }

        com.styleway.app.models.Group realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.styleway.app.models.Group.class);
            GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Group.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.styleway.app.models.Group.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_style_run_models_GroupRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.styleway.app.models.Group copy(Realm realm, com.styleway.app.models.Group newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.styleway.app.models.Group) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.styleway.app.models.Group realmObject = realm.createObjectInternal(com.styleway.app.models.Group.class, ((com_style_run_models_GroupRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_style_run_models_GroupRealmProxyInterface realmObjectSource = (com_style_run_models_GroupRealmProxyInterface) newObject;
        com_style_run_models_GroupRealmProxyInterface realmObjectCopy = (com_style_run_models_GroupRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$status(realmObjectSource.realmGet$status());
        realmObjectCopy.realmSet$image(realmObjectSource.realmGet$image());

        RealmList<com.styleway.app.models.MyString> userIdsList = realmObjectSource.realmGet$userIds();
        if (userIdsList != null) {
            RealmList<com.styleway.app.models.MyString> userIdsRealmList = realmObjectCopy.realmGet$userIds();
            userIdsRealmList.clear();
            for (int i = 0; i < userIdsList.size(); i++) {
                com.styleway.app.models.MyString userIdsItem = userIdsList.get(i);
                com.styleway.app.models.MyString cacheuserIds = (com.styleway.app.models.MyString) cache.get(userIdsItem);
                if (cacheuserIds != null) {
                    userIdsRealmList.add(cacheuserIds);
                } else {
                    userIdsRealmList.add(com_style_run_models_MyStringRealmProxy.copyOrUpdate(realm, userIdsItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, com.styleway.app.models.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Group.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$status = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        }
        String realmGet$image = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
        }

        RealmList<com.styleway.app.models.MyString> userIdsList = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$userIds();
        if (userIdsList != null) {
            OsList userIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.userIdsIndex);
            for (com.styleway.app.models.MyString userIdsItem : userIdsList) {
                Long cacheItemIndexuserIds = cache.get(userIdsItem);
                if (cacheItemIndexuserIds == null) {
                    cacheItemIndexuserIds = com_style_run_models_MyStringRealmProxy.insert(realm, userIdsItem, cache);
                }
                userIdsOsList.addRow(cacheItemIndexuserIds);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Group.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.styleway.app.models.Group object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$status = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            }
            String realmGet$image = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$image();
            if (realmGet$image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
            }

            RealmList<com.styleway.app.models.MyString> userIdsList = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$userIds();
            if (userIdsList != null) {
                OsList userIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.userIdsIndex);
                for (com.styleway.app.models.MyString userIdsItem : userIdsList) {
                    Long cacheItemIndexuserIds = cache.get(userIdsItem);
                    if (cacheItemIndexuserIds == null) {
                        cacheItemIndexuserIds = com_style_run_models_MyStringRealmProxy.insert(realm, userIdsItem, cache);
                    }
                    userIdsOsList.addRow(cacheItemIndexuserIds);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.styleway.app.models.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Group.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$status = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
        }
        String realmGet$image = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageIndex, rowIndex, false);
        }

        OsList userIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.userIdsIndex);
        RealmList<com.styleway.app.models.MyString> userIdsList = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$userIds();
        if (userIdsList != null && userIdsList.size() == userIdsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = userIdsList.size();
            for (int i = 0; i < objects; i++) {
                com.styleway.app.models.MyString userIdsItem = userIdsList.get(i);
                Long cacheItemIndexuserIds = cache.get(userIdsItem);
                if (cacheItemIndexuserIds == null) {
                    cacheItemIndexuserIds = com_style_run_models_MyStringRealmProxy.insertOrUpdate(realm, userIdsItem, cache);
                }
                userIdsOsList.setRow(i, cacheItemIndexuserIds);
            }
        } else {
            userIdsOsList.removeAll();
            if (userIdsList != null) {
                for (com.styleway.app.models.MyString userIdsItem : userIdsList) {
                    Long cacheItemIndexuserIds = cache.get(userIdsItem);
                    if (cacheItemIndexuserIds == null) {
                        cacheItemIndexuserIds = com_style_run_models_MyStringRealmProxy.insertOrUpdate(realm, userIdsItem, cache);
                    }
                    userIdsOsList.addRow(cacheItemIndexuserIds);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Group.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.styleway.app.models.Group object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$id();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$status = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
            }
            String realmGet$image = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$image();
            if (realmGet$image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imageIndex, rowIndex, false);
            }

            OsList userIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.userIdsIndex);
            RealmList<com.styleway.app.models.MyString> userIdsList = ((com_style_run_models_GroupRealmProxyInterface) object).realmGet$userIds();
            if (userIdsList != null && userIdsList.size() == userIdsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = userIdsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.styleway.app.models.MyString userIdsItem = userIdsList.get(i);
                    Long cacheItemIndexuserIds = cache.get(userIdsItem);
                    if (cacheItemIndexuserIds == null) {
                        cacheItemIndexuserIds = com_style_run_models_MyStringRealmProxy.insertOrUpdate(realm, userIdsItem, cache);
                    }
                    userIdsOsList.setRow(i, cacheItemIndexuserIds);
                }
            } else {
                userIdsOsList.removeAll();
                if (userIdsList != null) {
                    for (com.styleway.app.models.MyString userIdsItem : userIdsList) {
                        Long cacheItemIndexuserIds = cache.get(userIdsItem);
                        if (cacheItemIndexuserIds == null) {
                            cacheItemIndexuserIds = com_style_run_models_MyStringRealmProxy.insertOrUpdate(realm, userIdsItem, cache);
                        }
                        userIdsOsList.addRow(cacheItemIndexuserIds);
                    }
                }
            }

        }
    }

    public static com.styleway.app.models.Group createDetachedCopy(com.styleway.app.models.Group realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.styleway.app.models.Group unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.styleway.app.models.Group();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.styleway.app.models.Group) cachedObject.object;
            }
            unmanagedObject = (com.styleway.app.models.Group) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_style_run_models_GroupRealmProxyInterface unmanagedCopy = (com_style_run_models_GroupRealmProxyInterface) unmanagedObject;
        com_style_run_models_GroupRealmProxyInterface realmSource = (com_style_run_models_GroupRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$image(realmSource.realmGet$image());

        // Deep copy of userIds
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$userIds(null);
        } else {
            RealmList<com.styleway.app.models.MyString> manageduserIdsList = realmSource.realmGet$userIds();
            RealmList<com.styleway.app.models.MyString> unmanageduserIdsList = new RealmList<com.styleway.app.models.MyString>();
            unmanagedCopy.realmSet$userIds(unmanageduserIdsList);
            int nextDepth = currentDepth + 1;
            int size = manageduserIdsList.size();
            for (int i = 0; i < size; i++) {
                com.styleway.app.models.MyString item = com_style_run_models_MyStringRealmProxy.createDetachedCopy(manageduserIdsList.get(i), nextDepth, maxDepth, cache);
                unmanageduserIdsList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.styleway.app.models.Group update(Realm realm, com.styleway.app.models.Group realmObject, com.styleway.app.models.Group newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_style_run_models_GroupRealmProxyInterface realmObjectTarget = (com_style_run_models_GroupRealmProxyInterface) realmObject;
        com_style_run_models_GroupRealmProxyInterface realmObjectSource = (com_style_run_models_GroupRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$status(realmObjectSource.realmGet$status());
        realmObjectTarget.realmSet$image(realmObjectSource.realmGet$image());
        RealmList<com.styleway.app.models.MyString> userIdsList = realmObjectSource.realmGet$userIds();
        RealmList<com.styleway.app.models.MyString> userIdsRealmList = realmObjectTarget.realmGet$userIds();
        if (userIdsList != null && userIdsList.size() == userIdsRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = userIdsList.size();
            for (int i = 0; i < objects; i++) {
                com.styleway.app.models.MyString userIdsItem = userIdsList.get(i);
                com.styleway.app.models.MyString cacheuserIds = (com.styleway.app.models.MyString) cache.get(userIdsItem);
                if (cacheuserIds != null) {
                    userIdsRealmList.set(i, cacheuserIds);
                } else {
                    userIdsRealmList.set(i, com_style_run_models_MyStringRealmProxy.copyOrUpdate(realm, userIdsItem, true, cache));
                }
            }
        } else {
            userIdsRealmList.clear();
            if (userIdsList != null) {
                for (int i = 0; i < userIdsList.size(); i++) {
                    com.styleway.app.models.MyString userIdsItem = userIdsList.get(i);
                    com.styleway.app.models.MyString cacheuserIds = (com.styleway.app.models.MyString) cache.get(userIdsItem);
                    if (cacheuserIds != null) {
                        userIdsRealmList.add(cacheuserIds);
                    } else {
                        userIdsRealmList.add(com_style_run_models_MyStringRealmProxy.copyOrUpdate(realm, userIdsItem, true, cache));
                    }
                }
            }
        }
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Group = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{image:");
        stringBuilder.append(realmGet$image() != null ? realmGet$image() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userIds:");
        stringBuilder.append("RealmList<MyString>[").append(realmGet$userIds().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}
