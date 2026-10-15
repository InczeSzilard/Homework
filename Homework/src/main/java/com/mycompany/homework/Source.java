
package com.mycompany.homework;

//Mini feladat: Tervezd meg az RSSSource, DatabaseSource és MockSource osztályokat úgy,
//hogy ugyanazon interface-t implementálják.
public class Source {
    

// Represents an RSS data source
public class RSSSource : IDataSource
{
    // Retrieves data from an RSS feed
    public List<string> GetData()
    {
        return new List<string>();
    }
}

// Represents a database data source
public class DatabaseSource : IDataSource
{
    // Retrieves data from a database
    public List<string> GetData()
    {
        return new List<string>();
    }
}

// Represents a mock data source used for testing
public class MockSource : IDataSource
{
    // Returns sample data for testing purposes
    public List<string> GetData()
    {
        return new List<string>();
    }
}
}
