/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodb;
import com.mongodb.MongoClient;
import com.mongodb.MongoNamespace;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author aziz
 */
public class MongoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //******** Connection to server ********\\
            MongoClient client = new MongoClient("127.0.0.1",27017);
            System.out.println("**************************************\n Connection to server: "+ client.getConnectPoint());
        
        //******** Access to DB ********\\
            MongoDatabase database = client.getDatabase("School");
        
        
        //******** Create Collection ********\\
            MongoCollection<Document> collection = database.getCollection("Info");        
        
        //******** Create Document ********\\
            Document document = new Document
                       ("ID",1)
                .append("Name", "aziz")
                .append("Age", 21)
                .append("Courses", Arrays.asList("Java","DB","PHP"))
                .append("More Info", new Document("isActive",true)
                        .append("GPA", 84.25)
                );        
        
        //******** Insert one Document ********\\
            collection.insertOne(document);        
        Document document10 = new Document(
                        ("id",12019)
                        .append("Name", "Ahmed")
                        .append("department", "Engineer")
                        .append("years_of_experience", 5)
                        .append("skills", new Document("isActive",true))

                        .append("contact_information", 84.25)

                        .append("business_trips", Arrays.asList("Java","DB","PHP")));
                        
        //******** Get Number of documents ********\\
            System.out.println("**************************************\n Number of Document:"+collection.count());
        
        //******** Insert many Document ********\\
            /*List<Document> listDoc = new ArrayList<Document>();
            for (int i = 2; i < 10; i++) {
                listDoc.add(new Document("ID",i));
            }
            collection.insertMany(listDoc);*/
            
        //******** Get Number of documents ********\\
            System.out.println("**************************************\n Number of Document:"+collection.count(document));
            
        
        //******** Get First Document ********\\
            /*Document document1 = collection.find().first();
            System.out.println(""+document1.toJson());*/        
        
        //******** Get All Documents ********\\
            int i = 0;
            MongoCursor<Document> cursor = collection.find().iterator();
            System.out.println("**************************************\n Get All Documents");            
            while (cursor.hasNext()) {            
                System.out.println(++i+">>"+cursor.next().toJson());
            }        
        
        //******** Find some Documents ********\\
            /*Document document2 = collection.find(Filters.eq("ID",4)).first();
            System.out.println("Find: "+document2.toJson());*/               
        
        //******** Create new Document ********\\
            /*Document document4 = new Document
                           ("ID",10)
                    .append("Name", "aziz")
                    .append("Age", 30)
                    .append("Courses", Arrays.asList("Java","DB","PHP"))
                    .append("More Info", new Document("isActive",true)
                            .append("GPA", 100)
                    );*/
            
        //******** Insert one Document ********\\
            //collection.insertOne(document4);
            
        //******** Find some Documents ********\\
            /*Document document3 = collection.find(Filters.eq("ID",10)).first();
            System.out.println(""+document3.toJson());*/
        
        //******** Find some Documents ********\\
            /*collection.find(Filters.gt("ID",5));
            System.out.println("Find some Documents");
            for (Document document5 : collection.find(Filters.gt("ID",5))) {
                System.out.println(""+document5.toJson());
            }*/
        
        //******** Upadte one Document ********\\
            /*UpdateResult result = collection.updateOne(Filters.eq("ID",1), Updates.set("name", "hassan"));
            System.out.println("**************************************\n One Document Upadted: "+result.getModifiedCount());*/
        
        //******** Upadte many Documents ********\\
            /*UpdateResult result1 = collection.updateMany(Filters.gt("ID",5), Updates.set("ID", 50));
            System.out.println("**************************************\n Number of Upadted Documents: "+result1.getModifiedCount());*/       
        
        //******** Delete one Document ********\\
            /*DeleteResult result2 = collection.deleteOne(Filters.eq("ID", 1));
            System.out.println("**************************************\n One Document Deleted: "+result2.getDeletedCount());*/        
        
        //******** Delete many Documents ********\\
            /*DeleteResult result3 = collection.deleteMany(Filters.gt("ID", 0));
            System.out.println("**************************************\n Number of Deleted Documents: "+result3.getDeletedCount());*/        
        
        //******** Get Collection name ********\\
            for (String listCollectionName : database.listCollectionNames()) {
                System.out.println("**************************************\n Collection name: "+listCollectionName);
            }
        
    
}
