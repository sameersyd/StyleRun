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
public class com_styleway_run_models_MessageRealmProxy extends com.styleway.app.models.Message
    implements RealmObjectProxy, com_styleway_run_models_MessageRealmProxyInterface {

    static final class MessageColumnInfo extends ColumnInfo {
        long senderNameIndex;
        long senderImageIndex;
        long senderStatusIndex;
        long recipientNameIndex;
        long recipientImageIndex;
        long recipientStatusIndex;
        long bodyIndex;
        long idIndex;
        long recipientIdIndex;
        long senderIdIndex;
        long recipientGroupIdsIndex;
        long dateIndex;
        long deliveredIndex;
        long sentIndex;
        long attachmentTypeIndex;
        long attachmentIndex;

        MessageColumnInfo(OsSchemaInfo schemaInfo) {
            super(16);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Message");
            this.senderNameIndex = addColumnDetails("senderName", "senderName", objectSchemaInfo);
            this.senderImageIndex = addColumnDetails("senderImage", "senderImage", objectSchemaInfo);
            this.senderStatusIndex = addColumnDetails("senderStatus", "senderStatus", objectSchemaInfo);
            this.recipientNameIndex = addColumnDetails("recipientName", "recipientName", objectSchemaInfo);
            this.recipientImageIndex = addColumnDetails("recipientImage", "recipientImage", objectSchemaInfo);
            this.recipientStatusIndex = addColumnDetails("recipientStatus", "recipientStatus", objectSchemaInfo);
            this.bodyIndex = addColumnDetails("body", "body", objectSchemaInfo);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.recipientIdIndex = addColumnDetails("recipientId", "recipientId", objectSchemaInfo);
            this.senderIdIndex = addColumnDetails("senderId", "senderId", objectSchemaInfo);
            this.recipientGroupIdsIndex = addColumnDetails("recipientGroupIds", "recipientGroupIds", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.deliveredIndex = addColumnDetails("delivered", "delivered", objectSchemaInfo);
            this.sentIndex = addColumnDetails("sent", "sent", objectSchemaInfo);
            this.attachmentTypeIndex = addColumnDetails("attachmentType", "attachmentType", objectSchemaInfo);
            this.attachmentIndex = addColumnDetails("attachment", "attachment", objectSchemaInfo);
        }

        MessageColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MessageColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MessageColumnInfo src = (MessageColumnInfo) rawSrc;
            final MessageColumnInfo dst = (MessageColumnInfo) rawDst;
            dst.senderNameIndex = src.senderNameIndex;
            dst.senderImageIndex = src.senderImageIndex;
            dst.senderStatusIndex = src.senderStatusIndex;
            dst.recipientNameIndex = src.recipientNameIndex;
            dst.recipientImageIndex = src.recipientImageIndex;
            dst.recipientStatusIndex = src.recipientStatusIndex;
            dst.bodyIndex = src.bodyIndex;
            dst.idIndex = src.idIndex;
            dst.recipientIdIndex = src.recipientIdIndex;
            dst.senderIdIndex = src.senderIdIndex;
            dst.recipientGroupIdsIndex = src.recipientGroupIdsIndex;
            dst.dateIndex = src.dateIndex;
            dst.deliveredIndex = src.deliveredIndex;
            dst.sentIndex = src.sentIndex;
            dst.attachmentTypeIndex = src.attachmentTypeIndex;
            dst.attachmentIndex = src.attachmentIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MessageColumnInfo columnInfo;
    private ProxyState<com.styleway.app.models.Message> proxyState;
    private RealmList<com.styleway.app.models.MyString> recipientGroupIdsRealmList;

    com_styleway_run_models_MessageRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MessageColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.styleway.app.models.Message>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$senderName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.senderNameIndex);
    }

    @Override
    public void realmSet$senderName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.senderNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.senderNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.senderNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.senderNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$senderImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.senderImageIndex);
    }

    @Override
    public void realmSet$senderImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.senderImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.senderImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.senderImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.senderImageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$senderStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.senderStatusIndex);
    }

    @Override
    public void realmSet$senderStatus(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.senderStatusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.senderStatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.senderStatusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.senderStatusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$recipientName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.recipientNameIndex);
    }

    @Override
    public void realmSet$recipientName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.recipientNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.recipientNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.recipientNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.recipientNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$recipientImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.recipientImageIndex);
    }

    @Override
    public void realmSet$recipientImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.recipientImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.recipientImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.recipientImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.recipientImageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$recipientStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.recipientStatusIndex);
    }

    @Override
    public void realmSet$recipientStatus(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.recipientStatusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.recipientStatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.recipientStatusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.recipientStatusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$body() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bodyIndex);
    }

    @Override
    public void realmSet$body(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.bodyIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.bodyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.bodyIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.bodyIndex, value);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$recipientId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.recipientIdIndex);
    }

    @Override
    public void realmSet$recipientId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.recipientIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.recipientIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.recipientIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.recipientIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$senderId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.senderIdIndex);
    }

    @Override
    public void realmSet$senderId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.senderIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.senderIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.senderIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.senderIdIndex, value);
    }

    @Override
    public RealmList<com.styleway.app.models.MyString> realmGet$recipientGroupIds() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (recipientGroupIdsRealmList != null) {
            return recipientGroupIdsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.recipientGroupIdsIndex);
            recipientGroupIdsRealmList = new RealmList<com.styleway.app.models.MyString>(com.styleway.app.models.MyString.class, osList, proxyState.getRealm$realm());
            return recipientGroupIdsRealmList;
        }
    }

    @Override
    public void realmSet$recipientGroupIds(RealmList<com.styleway.app.models.MyString> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("recipientGroupIds")) {
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
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.recipientGroupIdsIndex);
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

    @Override
    @SuppressWarnings("cast")
    public long realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$delivered() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.deliveredIndex);
    }

    @Override
    public void realmSet$delivered(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.deliveredIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.deliveredIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$sent() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.sentIndex);
    }

    @Override
    public void realmSet$sent(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.sentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.sentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$attachmentType() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.attachmentTypeIndex);
    }

    @Override
    public void realmSet$attachmentType(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.attachmentTypeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.attachmentTypeIndex, value);
    }

    @Override
    public com.styleway.app.models.Attachment realmGet$attachment() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.attachmentIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.styleway.app.models.Attachment.class, proxyState.getRow$realm().getLink(columnInfo.attachmentIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$attachment(com.styleway.app.models.Attachment value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("attachment")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.attachmentIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.attachmentIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.attachmentIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.attachmentIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Message", 16, 0);
        builder.addPersistedProperty("senderName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("senderImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("senderStatus", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("recipientName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("recipientImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("recipientStatus", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("body", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("recipientId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("senderId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("recipientGroupIds", RealmFieldType.LIST, "MyString");
        builder.addPersistedProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("delivered", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("sent", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("attachmentType", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("attachment", RealmFieldType.OBJECT, "Attachment");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MessageColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MessageColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Message";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Message";
    }

    @SuppressWarnings("cast")
    public static com.styleway.app.models.Message createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        if (json.has("recipientGroupIds")) {
            excludeFields.add("recipientGroupIds");
        }
        if (json.has("attachment")) {
            excludeFields.add("attachment");
        }
        com.styleway.app.models.Message obj = realm.createObjectInternal(com.styleway.app.models.Message.class, true, excludeFields);

        final com_styleway_run_models_MessageRealmProxyInterface objProxy = (com_styleway_run_models_MessageRealmProxyInterface) obj;
        if (json.has("senderName")) {
            if (json.isNull("senderName")) {
                objProxy.realmSet$senderName(null);
            } else {
                objProxy.realmSet$senderName((String) json.getString("senderName"));
            }
        }
        if (json.has("senderImage")) {
            if (json.isNull("senderImage")) {
                objProxy.realmSet$senderImage(null);
            } else {
                objProxy.realmSet$senderImage((String) json.getString("senderImage"));
            }
        }
        if (json.has("senderStatus")) {
            if (json.isNull("senderStatus")) {
                objProxy.realmSet$senderStatus(null);
            } else {
                objProxy.realmSet$senderStatus((String) json.getString("senderStatus"));
            }
        }
        if (json.has("recipientName")) {
            if (json.isNull("recipientName")) {
                objProxy.realmSet$recipientName(null);
            } else {
                objProxy.realmSet$recipientName((String) json.getString("recipientName"));
            }
        }
        if (json.has("recipientImage")) {
            if (json.isNull("recipientImage")) {
                objProxy.realmSet$recipientImage(null);
            } else {
                objProxy.realmSet$recipientImage((String) json.getString("recipientImage"));
            }
        }
        if (json.has("recipientStatus")) {
            if (json.isNull("recipientStatus")) {
                objProxy.realmSet$recipientStatus(null);
            } else {
                objProxy.realmSet$recipientStatus((String) json.getString("recipientStatus"));
            }
        }
        if (json.has("body")) {
            if (json.isNull("body")) {
                objProxy.realmSet$body(null);
            } else {
                objProxy.realmSet$body((String) json.getString("body"));
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("recipientId")) {
            if (json.isNull("recipientId")) {
                objProxy.realmSet$recipientId(null);
            } else {
                objProxy.realmSet$recipientId((String) json.getString("recipientId"));
            }
        }
        if (json.has("senderId")) {
            if (json.isNull("senderId")) {
                objProxy.realmSet$senderId(null);
            } else {
                objProxy.realmSet$senderId((String) json.getString("senderId"));
            }
        }
        if (json.has("recipientGroupIds")) {
            if (json.isNull("recipientGroupIds")) {
                objProxy.realmSet$recipientGroupIds(null);
            } else {
                objProxy.realmGet$recipientGroupIds().clear();
                JSONArray array = json.getJSONArray("recipientGroupIds");
                for (int i = 0; i < array.length(); i++) {
                    com.styleway.app.models.MyString item = com_styleway_run_models_MyStringRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$recipientGroupIds().add(item);
                }
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                objProxy.realmSet$date((long) json.getLong("date"));
            }
        }
        if (json.has("delivered")) {
            if (json.isNull("delivered")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'delivered' to null.");
            } else {
                objProxy.realmSet$delivered((boolean) json.getBoolean("delivered"));
            }
        }
        if (json.has("sent")) {
            if (json.isNull("sent")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sent' to null.");
            } else {
                objProxy.realmSet$sent((boolean) json.getBoolean("sent"));
            }
        }
        if (json.has("attachmentType")) {
            if (json.isNull("attachmentType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'attachmentType' to null.");
            } else {
                objProxy.realmSet$attachmentType((int) json.getInt("attachmentType"));
            }
        }
        if (json.has("attachment")) {
            if (json.isNull("attachment")) {
                objProxy.realmSet$attachment(null);
            } else {
                com.styleway.app.models.Attachment attachmentObj = com_styleway_run_models_AttachmentRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("attachment"), update);
                objProxy.realmSet$attachment(attachmentObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.styleway.app.models.Message createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.styleway.app.models.Message obj = new com.styleway.app.models.Message();
        final com_styleway_run_models_MessageRealmProxyInterface objProxy = (com_styleway_run_models_MessageRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("senderName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$senderName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$senderName(null);
                }
            } else if (name.equals("senderImage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$senderImage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$senderImage(null);
                }
            } else if (name.equals("senderStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$senderStatus((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$senderStatus(null);
                }
            } else if (name.equals("recipientName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$recipientName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$recipientName(null);
                }
            } else if (name.equals("recipientImage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$recipientImage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$recipientImage(null);
                }
            } else if (name.equals("recipientStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$recipientStatus((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$recipientStatus(null);
                }
            } else if (name.equals("body")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$body((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$body(null);
                }
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("recipientId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$recipientId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$recipientId(null);
                }
            } else if (name.equals("senderId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$senderId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$senderId(null);
                }
            } else if (name.equals("recipientGroupIds")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$recipientGroupIds(null);
                } else {
                    objProxy.realmSet$recipientGroupIds(new RealmList<com.styleway.app.models.MyString>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.styleway.app.models.MyString item = com_styleway_run_models_MyStringRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$recipientGroupIds().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
            } else if (name.equals("delivered")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$delivered((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'delivered' to null.");
                }
            } else if (name.equals("sent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sent((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sent' to null.");
                }
            } else if (name.equals("attachmentType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$attachmentType((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'attachmentType' to null.");
                }
            } else if (name.equals("attachment")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$attachment(null);
                } else {
                    com.styleway.app.models.Attachment attachmentObj = com_styleway_run_models_AttachmentRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$attachment(attachmentObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.styleway.app.models.Message copyOrUpdate(Realm realm, com.styleway.app.models.Message object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.styleway.app.models.Message) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.styleway.app.models.Message copy(Realm realm, com.styleway.app.models.Message newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.styleway.app.models.Message) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.styleway.app.models.Message realmObject = realm.createObjectInternal(com.styleway.app.models.Message.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_styleway_run_models_MessageRealmProxyInterface realmObjectSource = (com_styleway_run_models_MessageRealmProxyInterface) newObject;
        com_styleway_run_models_MessageRealmProxyInterface realmObjectCopy = (com_styleway_run_models_MessageRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$senderName(realmObjectSource.realmGet$senderName());
        realmObjectCopy.realmSet$senderImage(realmObjectSource.realmGet$senderImage());
        realmObjectCopy.realmSet$senderStatus(realmObjectSource.realmGet$senderStatus());
        realmObjectCopy.realmSet$recipientName(realmObjectSource.realmGet$recipientName());
        realmObjectCopy.realmSet$recipientImage(realmObjectSource.realmGet$recipientImage());
        realmObjectCopy.realmSet$recipientStatus(realmObjectSource.realmGet$recipientStatus());
        realmObjectCopy.realmSet$body(realmObjectSource.realmGet$body());
        realmObjectCopy.realmSet$id(realmObjectSource.realmGet$id());
        realmObjectCopy.realmSet$recipientId(realmObjectSource.realmGet$recipientId());
        realmObjectCopy.realmSet$senderId(realmObjectSource.realmGet$senderId());

        RealmList<com.styleway.app.models.MyString> recipientGroupIdsList = realmObjectSource.realmGet$recipientGroupIds();
        if (recipientGroupIdsList != null) {
            RealmList<com.styleway.app.models.MyString> recipientGroupIdsRealmList = realmObjectCopy.realmGet$recipientGroupIds();
            recipientGroupIdsRealmList.clear();
            for (int i = 0; i < recipientGroupIdsList.size(); i++) {
                com.styleway.app.models.MyString recipientGroupIdsItem = recipientGroupIdsList.get(i);
                com.styleway.app.models.MyString cacherecipientGroupIds = (com.styleway.app.models.MyString) cache.get(recipientGroupIdsItem);
                if (cacherecipientGroupIds != null) {
                    recipientGroupIdsRealmList.add(cacherecipientGroupIds);
                } else {
                    recipientGroupIdsRealmList.add(com_styleway_run_models_MyStringRealmProxy.copyOrUpdate(realm, recipientGroupIdsItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectCopy.realmSet$delivered(realmObjectSource.realmGet$delivered());
        realmObjectCopy.realmSet$sent(realmObjectSource.realmGet$sent());
        realmObjectCopy.realmSet$attachmentType(realmObjectSource.realmGet$attachmentType());

        com.styleway.app.models.Attachment attachmentObj = realmObjectSource.realmGet$attachment();
        if (attachmentObj == null) {
            realmObjectCopy.realmSet$attachment(null);
        } else {
            com.styleway.app.models.Attachment cacheattachment = (com.styleway.app.models.Attachment) cache.get(attachmentObj);
            if (cacheattachment != null) {
                realmObjectCopy.realmSet$attachment(cacheattachment);
            } else {
                realmObjectCopy.realmSet$attachment(com_styleway_run_models_AttachmentRealmProxy.copyOrUpdate(realm, attachmentObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, com.styleway.app.models.Message object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Message.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$senderName = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderName();
        if (realmGet$senderName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
        }
        String realmGet$senderImage = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderImage();
        if (realmGet$senderImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderImageIndex, rowIndex, realmGet$senderImage, false);
        }
        String realmGet$senderStatus = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderStatus();
        if (realmGet$senderStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderStatusIndex, rowIndex, realmGet$senderStatus, false);
        }
        String realmGet$recipientName = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientName();
        if (realmGet$recipientName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientNameIndex, rowIndex, realmGet$recipientName, false);
        }
        String realmGet$recipientImage = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientImage();
        if (realmGet$recipientImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientImageIndex, rowIndex, realmGet$recipientImage, false);
        }
        String realmGet$recipientStatus = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientStatus();
        if (realmGet$recipientStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientStatusIndex, rowIndex, realmGet$recipientStatus, false);
        }
        String realmGet$body = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
        }
        String realmGet$id = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        }
        String realmGet$recipientId = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientId();
        if (realmGet$recipientId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, realmGet$recipientId, false);
        }
        String realmGet$senderId = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderId();
        if (realmGet$senderId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderIdIndex, rowIndex, realmGet$senderId, false);
        }

        RealmList<com.styleway.app.models.MyString> recipientGroupIdsList = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientGroupIds();
        if (recipientGroupIdsList != null) {
            OsList recipientGroupIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientGroupIdsIndex);
            for (com.styleway.app.models.MyString recipientGroupIdsItem : recipientGroupIdsList) {
                Long cacheItemIndexrecipientGroupIds = cache.get(recipientGroupIdsItem);
                if (cacheItemIndexrecipientGroupIds == null) {
                    cacheItemIndexrecipientGroupIds = com_styleway_run_models_MyStringRealmProxy.insert(realm, recipientGroupIdsItem, cache);
                }
                recipientGroupIdsOsList.addRow(cacheItemIndexrecipientGroupIds);
            }
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveredIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$delivered(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.sentIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$sent(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.attachmentTypeIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$attachmentType(), false);

        com.styleway.app.models.Attachment attachmentObj = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$attachment();
        if (attachmentObj != null) {
            Long cacheattachment = cache.get(attachmentObj);
            if (cacheattachment == null) {
                cacheattachment = com_styleway_run_models_AttachmentRealmProxy.insert(realm, attachmentObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex, cacheattachment, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Message.class);
        com.styleway.app.models.Message object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.Message) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$senderName = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderName();
            if (realmGet$senderName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
            }
            String realmGet$senderImage = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderImage();
            if (realmGet$senderImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderImageIndex, rowIndex, realmGet$senderImage, false);
            }
            String realmGet$senderStatus = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderStatus();
            if (realmGet$senderStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderStatusIndex, rowIndex, realmGet$senderStatus, false);
            }
            String realmGet$recipientName = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientName();
            if (realmGet$recipientName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientNameIndex, rowIndex, realmGet$recipientName, false);
            }
            String realmGet$recipientImage = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientImage();
            if (realmGet$recipientImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientImageIndex, rowIndex, realmGet$recipientImage, false);
            }
            String realmGet$recipientStatus = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientStatus();
            if (realmGet$recipientStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientStatusIndex, rowIndex, realmGet$recipientStatus, false);
            }
            String realmGet$body = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
            }
            String realmGet$id = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            }
            String realmGet$recipientId = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientId();
            if (realmGet$recipientId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, realmGet$recipientId, false);
            }
            String realmGet$senderId = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderId();
            if (realmGet$senderId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderIdIndex, rowIndex, realmGet$senderId, false);
            }

            RealmList<com.styleway.app.models.MyString> recipientGroupIdsList = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientGroupIds();
            if (recipientGroupIdsList != null) {
                OsList recipientGroupIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientGroupIdsIndex);
                for (com.styleway.app.models.MyString recipientGroupIdsItem : recipientGroupIdsList) {
                    Long cacheItemIndexrecipientGroupIds = cache.get(recipientGroupIdsItem);
                    if (cacheItemIndexrecipientGroupIds == null) {
                        cacheItemIndexrecipientGroupIds = com_styleway_run_models_MyStringRealmProxy.insert(realm, recipientGroupIdsItem, cache);
                    }
                    recipientGroupIdsOsList.addRow(cacheItemIndexrecipientGroupIds);
                }
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveredIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$delivered(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.sentIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$sent(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.attachmentTypeIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$attachmentType(), false);

            com.styleway.app.models.Attachment attachmentObj = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$attachment();
            if (attachmentObj != null) {
                Long cacheattachment = cache.get(attachmentObj);
                if (cacheattachment == null) {
                    cacheattachment = com_styleway_run_models_AttachmentRealmProxy.insert(realm, attachmentObj, cache);
                }
                table.setLink(columnInfo.attachmentIndex, rowIndex, cacheattachment, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.styleway.app.models.Message object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Message.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$senderName = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderName();
        if (realmGet$senderName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderNameIndex, rowIndex, false);
        }
        String realmGet$senderImage = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderImage();
        if (realmGet$senderImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderImageIndex, rowIndex, realmGet$senderImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderImageIndex, rowIndex, false);
        }
        String realmGet$senderStatus = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderStatus();
        if (realmGet$senderStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderStatusIndex, rowIndex, realmGet$senderStatus, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderStatusIndex, rowIndex, false);
        }
        String realmGet$recipientName = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientName();
        if (realmGet$recipientName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientNameIndex, rowIndex, realmGet$recipientName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.recipientNameIndex, rowIndex, false);
        }
        String realmGet$recipientImage = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientImage();
        if (realmGet$recipientImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientImageIndex, rowIndex, realmGet$recipientImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.recipientImageIndex, rowIndex, false);
        }
        String realmGet$recipientStatus = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientStatus();
        if (realmGet$recipientStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientStatusIndex, rowIndex, realmGet$recipientStatus, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.recipientStatusIndex, rowIndex, false);
        }
        String realmGet$body = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bodyIndex, rowIndex, false);
        }
        String realmGet$id = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        String realmGet$recipientId = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientId();
        if (realmGet$recipientId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, realmGet$recipientId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, false);
        }
        String realmGet$senderId = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderId();
        if (realmGet$senderId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderIdIndex, rowIndex, realmGet$senderId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderIdIndex, rowIndex, false);
        }

        OsList recipientGroupIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientGroupIdsIndex);
        RealmList<com.styleway.app.models.MyString> recipientGroupIdsList = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientGroupIds();
        if (recipientGroupIdsList != null && recipientGroupIdsList.size() == recipientGroupIdsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = recipientGroupIdsList.size();
            for (int i = 0; i < objects; i++) {
                com.styleway.app.models.MyString recipientGroupIdsItem = recipientGroupIdsList.get(i);
                Long cacheItemIndexrecipientGroupIds = cache.get(recipientGroupIdsItem);
                if (cacheItemIndexrecipientGroupIds == null) {
                    cacheItemIndexrecipientGroupIds = com_styleway_run_models_MyStringRealmProxy.insertOrUpdate(realm, recipientGroupIdsItem, cache);
                }
                recipientGroupIdsOsList.setRow(i, cacheItemIndexrecipientGroupIds);
            }
        } else {
            recipientGroupIdsOsList.removeAll();
            if (recipientGroupIdsList != null) {
                for (com.styleway.app.models.MyString recipientGroupIdsItem : recipientGroupIdsList) {
                    Long cacheItemIndexrecipientGroupIds = cache.get(recipientGroupIdsItem);
                    if (cacheItemIndexrecipientGroupIds == null) {
                        cacheItemIndexrecipientGroupIds = com_styleway_run_models_MyStringRealmProxy.insertOrUpdate(realm, recipientGroupIdsItem, cache);
                    }
                    recipientGroupIdsOsList.addRow(cacheItemIndexrecipientGroupIds);
                }
            }
        }

        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveredIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$delivered(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.sentIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$sent(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.attachmentTypeIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$attachmentType(), false);

        com.styleway.app.models.Attachment attachmentObj = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$attachment();
        if (attachmentObj != null) {
            Long cacheattachment = cache.get(attachmentObj);
            if (cacheattachment == null) {
                cacheattachment = com_styleway_run_models_AttachmentRealmProxy.insertOrUpdate(realm, attachmentObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex, cacheattachment, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Message.class);
        com.styleway.app.models.Message object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.Message) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$senderName = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderName();
            if (realmGet$senderName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderNameIndex, rowIndex, false);
            }
            String realmGet$senderImage = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderImage();
            if (realmGet$senderImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderImageIndex, rowIndex, realmGet$senderImage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderImageIndex, rowIndex, false);
            }
            String realmGet$senderStatus = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderStatus();
            if (realmGet$senderStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderStatusIndex, rowIndex, realmGet$senderStatus, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderStatusIndex, rowIndex, false);
            }
            String realmGet$recipientName = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientName();
            if (realmGet$recipientName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientNameIndex, rowIndex, realmGet$recipientName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.recipientNameIndex, rowIndex, false);
            }
            String realmGet$recipientImage = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientImage();
            if (realmGet$recipientImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientImageIndex, rowIndex, realmGet$recipientImage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.recipientImageIndex, rowIndex, false);
            }
            String realmGet$recipientStatus = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientStatus();
            if (realmGet$recipientStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientStatusIndex, rowIndex, realmGet$recipientStatus, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.recipientStatusIndex, rowIndex, false);
            }
            String realmGet$body = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bodyIndex, rowIndex, false);
            }
            String realmGet$id = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
            String realmGet$recipientId = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientId();
            if (realmGet$recipientId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, realmGet$recipientId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, false);
            }
            String realmGet$senderId = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$senderId();
            if (realmGet$senderId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderIdIndex, rowIndex, realmGet$senderId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderIdIndex, rowIndex, false);
            }

            OsList recipientGroupIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.recipientGroupIdsIndex);
            RealmList<com.styleway.app.models.MyString> recipientGroupIdsList = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$recipientGroupIds();
            if (recipientGroupIdsList != null && recipientGroupIdsList.size() == recipientGroupIdsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = recipientGroupIdsList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.styleway.app.models.MyString recipientGroupIdsItem = recipientGroupIdsList.get(i);
                    Long cacheItemIndexrecipientGroupIds = cache.get(recipientGroupIdsItem);
                    if (cacheItemIndexrecipientGroupIds == null) {
                        cacheItemIndexrecipientGroupIds = com_styleway_run_models_MyStringRealmProxy.insertOrUpdate(realm, recipientGroupIdsItem, cache);
                    }
                    recipientGroupIdsOsList.setRow(i, cacheItemIndexrecipientGroupIds);
                }
            } else {
                recipientGroupIdsOsList.removeAll();
                if (recipientGroupIdsList != null) {
                    for (com.styleway.app.models.MyString recipientGroupIdsItem : recipientGroupIdsList) {
                        Long cacheItemIndexrecipientGroupIds = cache.get(recipientGroupIdsItem);
                        if (cacheItemIndexrecipientGroupIds == null) {
                            cacheItemIndexrecipientGroupIds = com_styleway_run_models_MyStringRealmProxy.insertOrUpdate(realm, recipientGroupIdsItem, cache);
                        }
                        recipientGroupIdsOsList.addRow(cacheItemIndexrecipientGroupIds);
                    }
                }
            }

            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveredIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$delivered(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.sentIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$sent(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.attachmentTypeIndex, rowIndex, ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$attachmentType(), false);

            com.styleway.app.models.Attachment attachmentObj = ((com_styleway_run_models_MessageRealmProxyInterface) object).realmGet$attachment();
            if (attachmentObj != null) {
                Long cacheattachment = cache.get(attachmentObj);
                if (cacheattachment == null) {
                    cacheattachment = com_styleway_run_models_AttachmentRealmProxy.insertOrUpdate(realm, attachmentObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex, cacheattachment, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex);
            }
        }
    }

    public static com.styleway.app.models.Message createDetachedCopy(com.styleway.app.models.Message realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.styleway.app.models.Message unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.styleway.app.models.Message();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.styleway.app.models.Message) cachedObject.object;
            }
            unmanagedObject = (com.styleway.app.models.Message) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_styleway_run_models_MessageRealmProxyInterface unmanagedCopy = (com_styleway_run_models_MessageRealmProxyInterface) unmanagedObject;
        com_styleway_run_models_MessageRealmProxyInterface realmSource = (com_styleway_run_models_MessageRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$senderName(realmSource.realmGet$senderName());
        unmanagedCopy.realmSet$senderImage(realmSource.realmGet$senderImage());
        unmanagedCopy.realmSet$senderStatus(realmSource.realmGet$senderStatus());
        unmanagedCopy.realmSet$recipientName(realmSource.realmGet$recipientName());
        unmanagedCopy.realmSet$recipientImage(realmSource.realmGet$recipientImage());
        unmanagedCopy.realmSet$recipientStatus(realmSource.realmGet$recipientStatus());
        unmanagedCopy.realmSet$body(realmSource.realmGet$body());
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$recipientId(realmSource.realmGet$recipientId());
        unmanagedCopy.realmSet$senderId(realmSource.realmGet$senderId());

        // Deep copy of recipientGroupIds
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$recipientGroupIds(null);
        } else {
            RealmList<com.styleway.app.models.MyString> managedrecipientGroupIdsList = realmSource.realmGet$recipientGroupIds();
            RealmList<com.styleway.app.models.MyString> unmanagedrecipientGroupIdsList = new RealmList<com.styleway.app.models.MyString>();
            unmanagedCopy.realmSet$recipientGroupIds(unmanagedrecipientGroupIdsList);
            int nextDepth = currentDepth + 1;
            int size = managedrecipientGroupIdsList.size();
            for (int i = 0; i < size; i++) {
                com.styleway.app.models.MyString item = com_styleway_run_models_MyStringRealmProxy.createDetachedCopy(managedrecipientGroupIdsList.get(i), nextDepth, maxDepth, cache);
                unmanagedrecipientGroupIdsList.add(item);
            }
        }
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$delivered(realmSource.realmGet$delivered());
        unmanagedCopy.realmSet$sent(realmSource.realmGet$sent());
        unmanagedCopy.realmSet$attachmentType(realmSource.realmGet$attachmentType());

        // Deep copy of attachment
        unmanagedCopy.realmSet$attachment(com_styleway_run_models_AttachmentRealmProxy.createDetachedCopy(realmSource.realmGet$attachment(), currentDepth + 1, maxDepth, cache));

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Message = proxy[");
        stringBuilder.append("{senderName:");
        stringBuilder.append(realmGet$senderName() != null ? realmGet$senderName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{senderImage:");
        stringBuilder.append(realmGet$senderImage() != null ? realmGet$senderImage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{senderStatus:");
        stringBuilder.append(realmGet$senderStatus() != null ? realmGet$senderStatus() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipientName:");
        stringBuilder.append(realmGet$recipientName() != null ? realmGet$recipientName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipientImage:");
        stringBuilder.append(realmGet$recipientImage() != null ? realmGet$recipientImage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipientStatus:");
        stringBuilder.append(realmGet$recipientStatus() != null ? realmGet$recipientStatus() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{body:");
        stringBuilder.append(realmGet$body() != null ? realmGet$body() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipientId:");
        stringBuilder.append(realmGet$recipientId() != null ? realmGet$recipientId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{senderId:");
        stringBuilder.append(realmGet$senderId() != null ? realmGet$senderId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipientGroupIds:");
        stringBuilder.append("RealmList<MyString>[").append(realmGet$recipientGroupIds().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{delivered:");
        stringBuilder.append(realmGet$delivered());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sent:");
        stringBuilder.append(realmGet$sent());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachmentType:");
        stringBuilder.append(realmGet$attachmentType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachment:");
        stringBuilder.append(realmGet$attachment() != null ? "Attachment" : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}
