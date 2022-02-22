package Curs14;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.*;
import org.bson.Document;

public class MongoConnection {
    public static void main(String[] args) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://testuser:testuser@cluster0.bkai1.mongodb.net/sample_analytics?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("test");
        for(String name : database.listCollectionNames()){
            System.out.println("Name " + name);
        }
        System.out.println(database.getCollection("customers").countDocuments());
        MongoCollection<Document> customerCollection = database.getCollection("customer");
        //Document obj = (Document) customerCollection.find(new Document("username", "wesley20"));
        //System.out.println(obj.toString());
        FindIterable<Document> it = customerCollection.find();
        MongoCursor<Document> cursor = it.iterator();
        while (cursor.hasNext()){
            System.out.println(cursor.next().toJson());
        }
    }
}
