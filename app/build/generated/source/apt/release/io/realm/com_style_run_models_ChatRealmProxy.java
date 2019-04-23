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
public class com_style_run_models_ChatRealmProxy extends com.styleway.app.models.Chat
    implements RealmObjectProxy, com_style_run_models_ChatRealmProxyInterface {

    static final class ChatColumnInfo extends ColumnInfo {
        long messagesIndex;
        long lastMessageIndex;
        long myIdIndex;
        long chatIdIndex;
        long chatNameIndex;
        long chatImageIndex;
        long chatStatusIndex;
        long timeUpdatedIndex;
        long readIndex;
        long groupIndex;

        ChatColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Chat");
            this.messagesIndex = addColumnDetails("messages", "messages", objectSchemaInfo);
            this.lastMessageIndex = addColumnDetails("lastMessage", "lastMessage", objectSchemaInfo);
            this.myIdIndex = addColumnDetails("myId", "myId", objectSchemaInfo);
            this.chatIdIndex = addColumnDetails("chatId", "chatId", objectSchemaInfo);
            this.chatNameIndex = addColumnDetails("chatName", "chatName", objectSchemaInfo);
            this.chatImageIndex = addColumnDetails("chatImage", "chatImage", objectSchemaInfo);
            this.chatStatusIndex = addColumnDetails("chatStatus", "chatStatus", objectSchemaInfo);
            this.timeUpdatedIndex = addColumnDetails("timeUpdated", "timeUpdated", objectSchemaInfo);
            this.readIndex = addColumnDetails("read", "read", objectSchemaInfo);
            this.groupIndex = addColumnDetails("group", "group", objectSchemaInfo);
        }

        ChatColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ChatColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ChatColumnInfo src = (ChatColumnInfo) rawSrc;
            final ChatColumnInfo dst = (ChatColumnInfo) rawDst;
            dst.messagesIndex = src.messagesIndex;
            dst.lastMessageIndex = src.lastMessageIndex;
            dst.myIdIndex = src.myIdIndex;
            dst.chatIdIndex = src.chatIdIndex;
            dst.chatNameIndex = src.chatNameIndex;
            dst.chatImageIndex = src.chatImageIndex;
            dst.chatStatusIndex = src.chatStatusIndex;
            dst.timeUpdatedIndex = src.timeUpdatedIndex;
            dst.readIndex = src.readIndex;
            dst.groupIndex = src.groupIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ChatColumnInfo columnInfo;
    private ProxyState<com.styleway.app.models.Chat> proxyState;
    private RealmList<com.styleway.app.models.Message> messagesRealmList;

    com_style_run_models_ChatRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ChatColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.styleway.app.models.Chat>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    public RealmList<com.styleway.app.models.Message> realmGet$messages() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (messagesRealmList != null) {
            return messagesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.messagesIndex);
            messagesRealmList = new RealmList<com.styleway.app.models.Message>(com.styleway.app.models.Message.class, osList, proxyState.getRealm$realm());
            return messagesRealmList;
        }
    }

    @Override
    public void realmSet$messages(RealmList<com.styleway.app.models.Message> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("messages")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.styleway.app.models.Message> original = value;
                value = new RealmList<com.styleway.app.models.Message>();
                for (com.styleway.app.models.Message item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.messagesIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.styleway.app.models.Message linkedObject = value.get(i);
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
                com.styleway.app.models.Message linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lastMessage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lastMessageIndex);
    }

    @Override
    public void realmSet$lastMessage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lastMessageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lastMessageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lastMessageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lastMessageIndex, value);
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
    public String realmGet$chatId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.chatIdIndex);
    }

    @Override
    public void realmSet$chatId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.chatIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.chatIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.chatIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.chatIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$chatName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.chatNameIndex);
    }

    @Override
    public void realmSet$chatName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.chatNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.chatNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.chatNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.chatNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$chatImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.chatImageIndex);
    }

    @Override
    public void realmSet$chatImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.chatImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.chatImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.chatImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.chatImageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$chatStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.chatStatusIndex);
    }

    @Override
    public void realmSet$chatStatus(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.chatStatusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.chatStatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.chatStatusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.chatStatusIndex, value);
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
    public boolean realmGet$read() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.readIndex);
    }

    @Override
    public void realmSet$read(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.readIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.readIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$group() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.groupIndex);
    }

    @Override
    public void realmSet$group(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.groupIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.groupIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Chat", 10, 0);
        builder.addPersistedLinkProperty("messages", RealmFieldType.LIST, "Message");
        builder.addPersistedProperty("lastMessage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("myId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("chatId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("chatName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("chatImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("chatStatus", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timeUpdated", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("read", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("group", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ChatColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ChatColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Chat";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Chat";
    }

    @SuppressWarnings("cast")
    public static com.styleway.app.models.Chat createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("messages")) {
            excludeFields.add("messages");
        }
        com.styleway.app.models.Chat obj = realm.createObjectInternal(com.styleway.app.models.Chat.class, true, excludeFields);

        final com_style_run_models_ChatRealmProxyInterface objProxy = (com_style_run_models_ChatRealmProxyInterface) obj;
        if (json.has("messages")) {
            if (json.isNull("messages")) {
                objProxy.realmSet$messages(null);
            } else {
                objProxy.realmGet$messages().clear();
                JSONArray array = json.getJSONArray("messages");
                for (int i = 0; i < array.length(); i++) {
                    com.styleway.app.models.Message item = com_style_run_models_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$messages().add(item);
                }
            }
        }
        if (json.has("lastMessage")) {
            if (json.isNull("lastMessage")) {
                objProxy.realmSet$lastMessage(null);
            } else {
                objProxy.realmSet$lastMessage((String) json.getString("lastMessage"));
            }
        }
        if (json.has("myId")) {
            if (json.isNull("myId")) {
                objProxy.realmSet$myId(null);
            } else {
                objProxy.realmSet$myId((String) json.getString("myId"));
            }
        }
        if (json.has("chatId")) {
            if (json.isNull("chatId")) {
                objProxy.realmSet$chatId(null);
            } else {
                objProxy.realmSet$chatId((String) json.getString("chatId"));
            }
        }
        if (json.has("chatName")) {
            if (json.isNull("chatName")) {
                objProxy.realmSet$chatName(null);
            } else {
                objProxy.realmSet$chatName((String) json.getString("chatName"));
            }
        }
        if (json.has("chatImage")) {
            if (json.isNull("chatImage")) {
                objProxy.realmSet$chatImage(null);
            } else {
                objProxy.realmSet$chatImage((String) json.getString("chatImage"));
            }
        }
        if (json.has("chatStatus")) {
            if (json.isNull("chatStatus")) {
                objProxy.realmSet$chatStatus(null);
            } else {
                objProxy.realmSet$chatStatus((String) json.getString("chatStatus"));
            }
        }
        if (json.has("timeUpdated")) {
            if (json.isNull("timeUpdated")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
            } else {
                objProxy.realmSet$timeUpdated((long) json.getLong("timeUpdated"));
            }
        }
        if (json.has("read")) {
            if (json.isNull("read")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
            } else {
                objProxy.realmSet$read((boolean) json.getBoolean("read"));
            }
        }
        if (json.has("group")) {
            if (json.isNull("group")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'group' to null.");
            } else {
                objProxy.realmSet$group((boolean) json.getBoolean("group"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.styleway.app.models.Chat createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.styleway.app.models.Chat obj = new com.styleway.app.models.Chat();
        final com_style_run_models_ChatRealmProxyInterface objProxy = (com_style_run_models_ChatRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("messages")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$messages(null);
                } else {
                    objProxy.realmSet$messages(new RealmList<com.styleway.app.models.Message>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.styleway.app.models.Message item = com_style_run_models_MessageRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$messages().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("lastMessage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastMessage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lastMessage(null);
                }
            } else if (name.equals("myId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$myId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$myId(null);
                }
            } else if (name.equals("chatId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chatId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$chatId(null);
                }
            } else if (name.equals("chatName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chatName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$chatName(null);
                }
            } else if (name.equals("chatImage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chatImage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$chatImage(null);
                }
            } else if (name.equals("chatStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chatStatus((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$chatStatus(null);
                }
            } else if (name.equals("timeUpdated")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeUpdated((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
                }
            } else if (name.equals("read")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$read((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
                }
            } else if (name.equals("group")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$group((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'group' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.styleway.app.models.Chat copyOrUpdate(Realm realm, com.styleway.app.models.Chat object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.styleway.app.models.Chat) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.styleway.app.models.Chat copy(Realm realm, com.styleway.app.models.Chat newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.styleway.app.models.Chat) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.styleway.app.models.Chat realmObject = realm.createObjectInternal(com.styleway.app.models.Chat.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_style_run_models_ChatRealmProxyInterface realmObjectSource = (com_style_run_models_ChatRealmProxyInterface) newObject;
        com_style_run_models_ChatRealmProxyInterface realmObjectCopy = (com_style_run_models_ChatRealmProxyInterface) realmObject;


        RealmList<com.styleway.app.models.Message> messagesList = realmObjectSource.realmGet$messages();
        if (messagesList != null) {
            RealmList<com.styleway.app.models.Message> messagesRealmList = realmObjectCopy.realmGet$messages();
            messagesRealmList.clear();
            for (int i = 0; i < messagesList.size(); i++) {
                com.styleway.app.models.Message messagesItem = messagesList.get(i);
                com.styleway.app.models.Message cachemessages = (com.styleway.app.models.Message) cache.get(messagesItem);
                if (cachemessages != null) {
                    messagesRealmList.add(cachemessages);
                } else {
                    messagesRealmList.add(com_style_run_models_MessageRealmProxy.copyOrUpdate(realm, messagesItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$lastMessage(realmObjectSource.realmGet$lastMessage());
        realmObjectCopy.realmSet$myId(realmObjectSource.realmGet$myId());
        realmObjectCopy.realmSet$chatId(realmObjectSource.realmGet$chatId());
        realmObjectCopy.realmSet$chatName(realmObjectSource.realmGet$chatName());
        realmObjectCopy.realmSet$chatImage(realmObjectSource.realmGet$chatImage());
        realmObjectCopy.realmSet$chatStatus(realmObjectSource.realmGet$chatStatus());
        realmObjectCopy.realmSet$timeUpdated(realmObjectSource.realmGet$timeUpdated());
        realmObjectCopy.realmSet$read(realmObjectSource.realmGet$read());
        realmObjectCopy.realmSet$group(realmObjectSource.realmGet$group());
        return realmObject;
    }

    public static long insert(Realm realm, com.styleway.app.models.Chat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Chat.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        RealmList<com.styleway.app.models.Message> messagesList = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$messages();
        if (messagesList != null) {
            OsList messagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.messagesIndex);
            for (com.styleway.app.models.Message messagesItem : messagesList) {
                Long cacheItemIndexmessages = cache.get(messagesItem);
                if (cacheItemIndexmessages == null) {
                    cacheItemIndexmessages = com_style_run_models_MessageRealmProxy.insert(realm, messagesItem, cache);
                }
                messagesOsList.addRow(cacheItemIndexmessages);
            }
        }
        String realmGet$lastMessage = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
        }
        String realmGet$myId = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        }
        String realmGet$chatId = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatId();
        if (realmGet$chatId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatIdIndex, rowIndex, realmGet$chatId, false);
        }
        String realmGet$chatName = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatName();
        if (realmGet$chatName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatNameIndex, rowIndex, realmGet$chatName, false);
        }
        String realmGet$chatImage = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatImage();
        if (realmGet$chatImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatImageIndex, rowIndex, realmGet$chatImage, false);
        }
        String realmGet$chatStatus = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatStatus();
        if (realmGet$chatStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatStatusIndex, rowIndex, realmGet$chatStatus, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$timeUpdated(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$read(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.groupIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$group(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Chat.class);
        com.styleway.app.models.Chat object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.Chat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            RealmList<com.styleway.app.models.Message> messagesList = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$messages();
            if (messagesList != null) {
                OsList messagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.messagesIndex);
                for (com.styleway.app.models.Message messagesItem : messagesList) {
                    Long cacheItemIndexmessages = cache.get(messagesItem);
                    if (cacheItemIndexmessages == null) {
                        cacheItemIndexmessages = com_style_run_models_MessageRealmProxy.insert(realm, messagesItem, cache);
                    }
                    messagesOsList.addRow(cacheItemIndexmessages);
                }
            }
            String realmGet$lastMessage = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$lastMessage();
            if (realmGet$lastMessage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
            }
            String realmGet$myId = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            }
            String realmGet$chatId = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatId();
            if (realmGet$chatId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatIdIndex, rowIndex, realmGet$chatId, false);
            }
            String realmGet$chatName = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatName();
            if (realmGet$chatName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatNameIndex, rowIndex, realmGet$chatName, false);
            }
            String realmGet$chatImage = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatImage();
            if (realmGet$chatImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatImageIndex, rowIndex, realmGet$chatImage, false);
            }
            String realmGet$chatStatus = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatStatus();
            if (realmGet$chatStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatStatusIndex, rowIndex, realmGet$chatStatus, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$timeUpdated(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$read(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.groupIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$group(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.styleway.app.models.Chat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.styleway.app.models.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Chat.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        OsList messagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.messagesIndex);
        RealmList<com.styleway.app.models.Message> messagesList = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$messages();
        if (messagesList != null && messagesList.size() == messagesOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = messagesList.size();
            for (int i = 0; i < objects; i++) {
                com.styleway.app.models.Message messagesItem = messagesList.get(i);
                Long cacheItemIndexmessages = cache.get(messagesItem);
                if (cacheItemIndexmessages == null) {
                    cacheItemIndexmessages = com_style_run_models_MessageRealmProxy.insertOrUpdate(realm, messagesItem, cache);
                }
                messagesOsList.setRow(i, cacheItemIndexmessages);
            }
        } else {
            messagesOsList.removeAll();
            if (messagesList != null) {
                for (com.styleway.app.models.Message messagesItem : messagesList) {
                    Long cacheItemIndexmessages = cache.get(messagesItem);
                    if (cacheItemIndexmessages == null) {
                        cacheItemIndexmessages = com_style_run_models_MessageRealmProxy.insertOrUpdate(realm, messagesItem, cache);
                    }
                    messagesOsList.addRow(cacheItemIndexmessages);
                }
            }
        }

        String realmGet$lastMessage = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, false);
        }
        String realmGet$myId = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
        }
        String realmGet$chatId = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatId();
        if (realmGet$chatId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatIdIndex, rowIndex, realmGet$chatId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.chatIdIndex, rowIndex, false);
        }
        String realmGet$chatName = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatName();
        if (realmGet$chatName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatNameIndex, rowIndex, realmGet$chatName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.chatNameIndex, rowIndex, false);
        }
        String realmGet$chatImage = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatImage();
        if (realmGet$chatImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatImageIndex, rowIndex, realmGet$chatImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.chatImageIndex, rowIndex, false);
        }
        String realmGet$chatStatus = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatStatus();
        if (realmGet$chatStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatStatusIndex, rowIndex, realmGet$chatStatus, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.chatStatusIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$timeUpdated(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$read(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.groupIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$group(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.styleway.app.models.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.styleway.app.models.Chat.class);
        com.styleway.app.models.Chat object = null;
        while (objects.hasNext()) {
            object = (com.styleway.app.models.Chat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            OsList messagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.messagesIndex);
            RealmList<com.styleway.app.models.Message> messagesList = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$messages();
            if (messagesList != null && messagesList.size() == messagesOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = messagesList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.styleway.app.models.Message messagesItem = messagesList.get(i);
                    Long cacheItemIndexmessages = cache.get(messagesItem);
                    if (cacheItemIndexmessages == null) {
                        cacheItemIndexmessages = com_style_run_models_MessageRealmProxy.insertOrUpdate(realm, messagesItem, cache);
                    }
                    messagesOsList.setRow(i, cacheItemIndexmessages);
                }
            } else {
                messagesOsList.removeAll();
                if (messagesList != null) {
                    for (com.styleway.app.models.Message messagesItem : messagesList) {
                        Long cacheItemIndexmessages = cache.get(messagesItem);
                        if (cacheItemIndexmessages == null) {
                            cacheItemIndexmessages = com_style_run_models_MessageRealmProxy.insertOrUpdate(realm, messagesItem, cache);
                        }
                        messagesOsList.addRow(cacheItemIndexmessages);
                    }
                }
            }

            String realmGet$lastMessage = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$lastMessage();
            if (realmGet$lastMessage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, false);
            }
            String realmGet$myId = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
            }
            String realmGet$chatId = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatId();
            if (realmGet$chatId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatIdIndex, rowIndex, realmGet$chatId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.chatIdIndex, rowIndex, false);
            }
            String realmGet$chatName = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatName();
            if (realmGet$chatName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatNameIndex, rowIndex, realmGet$chatName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.chatNameIndex, rowIndex, false);
            }
            String realmGet$chatImage = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatImage();
            if (realmGet$chatImage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatImageIndex, rowIndex, realmGet$chatImage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.chatImageIndex, rowIndex, false);
            }
            String realmGet$chatStatus = ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$chatStatus();
            if (realmGet$chatStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatStatusIndex, rowIndex, realmGet$chatStatus, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.chatStatusIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$timeUpdated(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$read(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.groupIndex, rowIndex, ((com_style_run_models_ChatRealmProxyInterface) object).realmGet$group(), false);
        }
    }

    public static com.styleway.app.models.Chat createDetachedCopy(com.styleway.app.models.Chat realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.styleway.app.models.Chat unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.styleway.app.models.Chat();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.styleway.app.models.Chat) cachedObject.object;
            }
            unmanagedObject = (com.styleway.app.models.Chat) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_style_run_models_ChatRealmProxyInterface unmanagedCopy = (com_style_run_models_ChatRealmProxyInterface) unmanagedObject;
        com_style_run_models_ChatRealmProxyInterface realmSource = (com_style_run_models_ChatRealmProxyInterface) realmObject;

        // Deep copy of messages
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$messages(null);
        } else {
            RealmList<com.styleway.app.models.Message> managedmessagesList = realmSource.realmGet$messages();
            RealmList<com.styleway.app.models.Message> unmanagedmessagesList = new RealmList<com.styleway.app.models.Message>();
            unmanagedCopy.realmSet$messages(unmanagedmessagesList);
            int nextDepth = currentDepth + 1;
            int size = managedmessagesList.size();
            for (int i = 0; i < size; i++) {
                com.styleway.app.models.Message item = com_style_run_models_MessageRealmProxy.createDetachedCopy(managedmessagesList.get(i), nextDepth, maxDepth, cache);
                unmanagedmessagesList.add(item);
            }
        }
        unmanagedCopy.realmSet$lastMessage(realmSource.realmGet$lastMessage());
        unmanagedCopy.realmSet$myId(realmSource.realmGet$myId());
        unmanagedCopy.realmSet$chatId(realmSource.realmGet$chatId());
        unmanagedCopy.realmSet$chatName(realmSource.realmGet$chatName());
        unmanagedCopy.realmSet$chatImage(realmSource.realmGet$chatImage());
        unmanagedCopy.realmSet$chatStatus(realmSource.realmGet$chatStatus());
        unmanagedCopy.realmSet$timeUpdated(realmSource.realmGet$timeUpdated());
        unmanagedCopy.realmSet$read(realmSource.realmGet$read());
        unmanagedCopy.realmSet$group(realmSource.realmGet$group());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Chat = proxy[");
        stringBuilder.append("{messages:");
        stringBuilder.append("RealmList<Message>[").append(realmGet$messages().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastMessage:");
        stringBuilder.append(realmGet$lastMessage() != null ? realmGet$lastMessage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{myId:");
        stringBuilder.append(realmGet$myId() != null ? realmGet$myId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{chatId:");
        stringBuilder.append(realmGet$chatId() != null ? realmGet$chatId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{chatName:");
        stringBuilder.append(realmGet$chatName() != null ? realmGet$chatName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{chatImage:");
        stringBuilder.append(realmGet$chatImage() != null ? realmGet$chatImage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{chatStatus:");
        stringBuilder.append(realmGet$chatStatus() != null ? realmGet$chatStatus() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeUpdated:");
        stringBuilder.append(realmGet$timeUpdated());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{read:");
        stringBuilder.append(realmGet$read());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{group:");
        stringBuilder.append(realmGet$group());
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
        com_style_run_models_ChatRealmProxy aChat = (com_style_run_models_ChatRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aChat.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aChat.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aChat.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
