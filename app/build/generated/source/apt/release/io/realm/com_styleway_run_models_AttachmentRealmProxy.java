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
public class com_styleway_run_models_AttachmentRealmProxy extends com.styleway.app.models.Attachment
    implements RealmObjectProxy, com_styleway_run_models_AttachmentRealmProxyInterface {

    static final class AttachmentColumnInfo extends ColumnInfo {
        long nameIndex;
        long dataIndex;
        long urlIndex;
        long bytesCountIndex;

        AttachmentColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Attachment");
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.dataIndex = addColumnDetails("data", "data", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.bytesCountIndex = addColumnDetails("bytesCount", "bytesCount", objectSchemaInfo);
        }

        AttachmentColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AttachmentColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AttachmentColumnInfo src = (AttachmentColumnInfo) rawSrc;
            final AttachmentColumnInfo dst = (AttachmentColumnInfo) rawDst;
            dst.nameIndex = src.nameIndex;
            dst.dataIndex = src.dataIndex;
            dst.urlIndex = src.urlIndex;
            dst.bytesCountIndex = src.bytesCountIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AttachmentColumnInfo columnInfo;
    private ProxyState<com.styleway.app.models.Attachment> proxyState;

    com_styleway_run_models_AttachmentRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AttachmentColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.styleway.app.models.Attachment>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public String realmGet$data() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dataIndex);
    }

    @Override
    public void realmSet$data(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dataIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dataIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dataIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dataIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$url() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urlIndex);
    }

    @Override
    public void realmSet$url(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.urlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.urlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.urlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.urlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$bytesCount() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.bytesCountIndex);
    }

    @Override
    public void realmSet$bytesCount(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.bytesCountIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.bytesCountIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Attachment", 4, 0);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("data", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("url", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("bytesCount", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AttachmentColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AttachmentColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Attachment";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Attachment";
    }

    @SuppressWarnings("cast")
    public static com.styleway.app.models.Attachment createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.styleway.app.models.Attachment obj = realm.createObjectInternal(com.styleway.app.models.Attachment.class, true, excludeFields);

        final com_styleway_run_models_AttachmentRealmProxyInterface objProxy = (com_styleway_run_models_AttachmentRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("data")) {
            if (json.isNull("data")) {
                objProxy.realmSet$data(null);
            } else {
                objProxy.realmSet$data((String) json.getString("data"));
            }
        }
        if (json.has("url")) {
            if (json.isNull("url")) {
                objProxy.realmSet$url(null);
            } else {
                objProxy.realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("bytesCount")) {
            if (json.isNull("bytesCount")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'bytesCount' to null.");
            } else {
                objProxy.realmSet$bytesCount((long) json.getLong("bytesCount"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.styleway.app.models.Attachment createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.styleway.app.models.Attachment obj = new com.styleway.app.models.Attachment();
        final com_styleway_run_models_AttachmentRealmProxyInterface objProxy = (com_styleway_run_models_AttachmentRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("data")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$data((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$data(null);
                }
            } else if (name.equals("url")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$url((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$url(null);
                }
            } else if (name.equals("bytesCount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bytesCount((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'bytesCount' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.styleway.app.models.Attachment copyOrUpdate(Realm realm, com.styleway.app.models.Attachment object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.styleway.app.models.Attachment) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.styleway.app.models.Attachment copy(Realm realm, com.styleway.app.models.Attachment newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.styleway.app.models.Attachment) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.styleway.app.models.Attachment realmObject = realm.createObjectInternal(com.styleway.app.models.Attachment.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_styleway_run_models_AttachmentRealmProxyInterface realmObjectSource = (com_styleway_run_models_AttachmentRealmProxyInterface) newObject;
        com_styleway_run_models_AttachmentRealmProxyInterface realmObjectCopy = (com_styleway_run_models_AttachmentRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$data(realmObjectSource.realmGet$data());
        realmObjectCopy.realmSet$url(realmObjectSource.realmGet$url());
        realmObjectCopy.realmSet$bytesCount(realmObjectSource.realmGet$bytesCount());
        return realmObject;
    }

    public static long insert(Realm realm, com.styleway.app.models.Attachment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Attachment.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$name = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$data = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        }
        String realmGet$url = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$bytesCount(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Attachment.class);
        com.styleway.app.models.Attachment object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.Attachment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$name = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$data = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            }
            String realmGet$url = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$bytesCount(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.styleway.app.models.Attachment object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Attachment.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$name = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$data = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
        }
        String realmGet$url = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$bytesCount(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.Attachment.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentColumnInfo columnInfo = (AttachmentColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Attachment.class);
        com.styleway.app.models.Attachment object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.Attachment) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$name = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$data = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
            }
            String realmGet$url = ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((com_styleway_run_models_AttachmentRealmProxyInterface) object).realmGet$bytesCount(), false);
        }
    }

    public static com.styleway.app.models.Attachment createDetachedCopy(com.styleway.app.models.Attachment realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.styleway.app.models.Attachment unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.styleway.app.models.Attachment();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.styleway.app.models.Attachment) cachedObject.object;
            }
            unmanagedObject = (com.styleway.app.models.Attachment) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_styleway_run_models_AttachmentRealmProxyInterface unmanagedCopy = (com_styleway_run_models_AttachmentRealmProxyInterface) unmanagedObject;
        com_styleway_run_models_AttachmentRealmProxyInterface realmSource = (com_styleway_run_models_AttachmentRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$data(realmSource.realmGet$data());
        unmanagedCopy.realmSet$url(realmSource.realmGet$url());
        unmanagedCopy.realmSet$bytesCount(realmSource.realmGet$bytesCount());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Attachment = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{data:");
        stringBuilder.append(realmGet$data() != null ? realmGet$data() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bytesCount:");
        stringBuilder.append(realmGet$bytesCount());
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
        com_styleway_run_models_AttachmentRealmProxy aAttachment = (com_styleway_run_models_AttachmentRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAttachment.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAttachment.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAttachment.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
