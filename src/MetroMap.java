public class MetroMap {

    /**
     * Builds and returns a Graph populated with Delhi Metro stations.
     * Covers Yellow, Blue, Red, and Violet lines with interchange connections.
     */
    public static Graph build() {
        Graph g = new Graph();

        // ── Yellow Line (Samaypur Badli ↔ HUDA City Centre) ─────────────────
        g.addStation("Samaypur Badli",        "Yellow");
        g.addStation("Rohini Sector 18-19",   "Yellow");
        g.addStation("Haiderpur Badli Mor",   "Yellow");
        g.addStation("Jahangirpuri",          "Yellow");
        g.addStation("Adarsh Nagar",          "Yellow");
        g.addStation("Azadpur",               "Yellow");
        g.addStation("Model Town",            "Yellow");
        g.addStation("GTB Nagar",             "Yellow");
        g.addStation("Vishwa Vidyalaya",      "Yellow");
        g.addStation("Vidhan Sabha",          "Yellow");
        g.addStation("Civil Lines",           "Yellow");
        g.addStation("Kashmere Gate",         "Yellow");  // interchange Yellow-Red
        g.addStation("Chandni Chowk",         "Yellow");
        g.addStation("Chawri Bazar",          "Yellow");
        g.addStation("New Delhi",             "Yellow");  // interchange Yellow-Airport
        g.addStation("Rajiv Chowk",           "Yellow");  // interchange Yellow-Blue
        g.addStation("Patel Chowk",           "Yellow");
        g.addStation("Central Secretariat",   "Yellow");
        g.addStation("Udyog Bhawan",          "Yellow");
        g.addStation("Lok Kalyan Marg",       "Yellow");
        g.addStation("Jor Bagh",              "Yellow");
        g.addStation("INA",                   "Yellow");
        g.addStation("AIIMS",                 "Yellow");
        g.addStation("Green Park",            "Yellow");
        g.addStation("Hauz Khas",             "Yellow");
        g.addStation("Malviya Nagar",         "Yellow");
        g.addStation("Saket",                 "Yellow");
        g.addStation("Qutab Minar",           "Yellow");
        g.addStation("Chhattarpur",           "Yellow");
        g.addStation("Sultanpur",             "Yellow");
        g.addStation("Ghitorni",              "Yellow");
        g.addStation("Arjan Garh",            "Yellow");
        g.addStation("Guru Dronacharya",      "Yellow");
        g.addStation("Sikanderpur",           "Yellow");
        g.addStation("MG Road",               "Yellow");
        g.addStation("IFFCO Chowk",           "Yellow");
        g.addStation("HUDA City Centre",      "Yellow");

        // Yellow Line edges (km approx)
        g.addEdge("Samaypur Badli",      "Rohini Sector 18-19",  1);
        g.addEdge("Rohini Sector 18-19", "Haiderpur Badli Mor",  1);
        g.addEdge("Haiderpur Badli Mor", "Jahangirpuri",         2);
        g.addEdge("Jahangirpuri",        "Adarsh Nagar",         2);
        g.addEdge("Adarsh Nagar",        "Azadpur",              2);
        g.addEdge("Azadpur",             "Model Town",           2);
        g.addEdge("Model Town",          "GTB Nagar",            2);
        g.addEdge("GTB Nagar",           "Vishwa Vidyalaya",     1);
        g.addEdge("Vishwa Vidyalaya",    "Vidhan Sabha",         2);
        g.addEdge("Vidhan Sabha",        "Civil Lines",          2);
        g.addEdge("Civil Lines",         "Kashmere Gate",        2);
        g.addEdge("Kashmere Gate",       "Chandni Chowk",        2);
        g.addEdge("Chandni Chowk",       "Chawri Bazar",         1);
        g.addEdge("Chawri Bazar",        "New Delhi",            2);
        g.addEdge("New Delhi",           "Rajiv Chowk",          1);
        g.addEdge("Rajiv Chowk",         "Patel Chowk",          1);
        g.addEdge("Patel Chowk",         "Central Secretariat",  1);
        g.addEdge("Central Secretariat", "Udyog Bhawan",         1);
        g.addEdge("Udyog Bhawan",        "Lok Kalyan Marg",      2);
        g.addEdge("Lok Kalyan Marg",     "Jor Bagh",             2);
        g.addEdge("Jor Bagh",            "INA",                  2);
        g.addEdge("INA",                 "AIIMS",                2);
        g.addEdge("AIIMS",               "Green Park",           2);
        g.addEdge("Green Park",          "Hauz Khas",            2);
        g.addEdge("Hauz Khas",           "Malviya Nagar",        3);
        g.addEdge("Malviya Nagar",       "Saket",                2);
        g.addEdge("Saket",               "Qutab Minar",          2);
        g.addEdge("Qutab Minar",         "Chhattarpur",          2);
        g.addEdge("Chhattarpur",         "Sultanpur",            3);
        g.addEdge("Sultanpur",           "Ghitorni",             2);
        g.addEdge("Ghitorni",            "Arjan Garh",           2);
        g.addEdge("Arjan Garh",          "Guru Dronacharya",     2);
        g.addEdge("Guru Dronacharya",    "Sikanderpur",          2);
        g.addEdge("Sikanderpur",         "MG Road",              1);
        g.addEdge("MG Road",             "IFFCO Chowk",          2);
        g.addEdge("IFFCO Chowk",         "HUDA City Centre",     2);

        // ── Blue Line (Dwarka Sector 21 ↔ Vaishali / Noida) ─────────────────
        g.addStation("Dwarka Sector 21",  "Blue");
        g.addStation("Dwarka Sector 8",   "Blue");
        g.addStation("Dwarka Sector 9",   "Blue");
        g.addStation("Dwarka Sector 10",  "Blue");
        g.addStation("Dwarka Sector 11",  "Blue");
        g.addStation("Dwarka Sector 12",  "Blue");
        g.addStation("Dwarka Sector 13",  "Blue");
        g.addStation("Dwarka Sector 14",  "Blue");
        g.addStation("Dwarka",            "Blue");
        g.addStation("Dwarka Mor",        "Blue");
        g.addStation("Nawada",            "Blue");
        g.addStation("Uttam Nagar West",  "Blue");
        g.addStation("Uttam Nagar East",  "Blue");
        g.addStation("Janakpuri West",    "Blue");
        g.addStation("Janakpuri East",    "Blue");
        g.addStation("Tilak Nagar",       "Blue");
        g.addStation("Subhash Nagar",     "Blue");
        g.addStation("Tagore Garden",     "Blue");
        g.addStation("Rajouri Garden",    "Blue");
        g.addStation("Ramesh Nagar",      "Blue");
        g.addStation("Moti Nagar",        "Blue");
        g.addStation("Kirti Nagar",       "Blue");
        g.addStation("Shadipur",          "Blue");
        g.addStation("Patel Nagar",       "Blue");
        g.addStation("Rajendra Place",    "Blue");
        g.addStation("Karol Bagh",        "Blue");
        g.addStation("Jhandewalan",       "Blue");
        g.addStation("Ramakrishna Ashram Marg", "Blue");
        // Rajiv Chowk already added (interchange)
        g.addStation("Barakhamba Road",   "Blue");
        g.addStation("Mandi House",       "Blue");
        g.addStation("Pragati Maidan",    "Blue");
        g.addStation("Indraprastha",      "Blue");
        g.addStation("Yamuna Bank",       "Blue");   // interchange Blue-branch
        g.addStation("Akshardham",        "Blue");
        g.addStation("Mayur Vihar-1",     "Blue");
        g.addStation("Mayur Vihar Extension", "Blue");
        g.addStation("New Ashok Nagar",   "Blue");
        g.addStation("Noida Sector 15",   "Blue");
        g.addStation("Noida Sector 16",   "Blue");
        g.addStation("Noida Sector 18",   "Blue");
        g.addStation("Botanical Garden",  "Blue");
        // Vaishali branch
        g.addStation("Kaushambi",         "Blue");
        g.addStation("Vaishali",          "Blue");

        // Blue Line edges
        g.addEdge("Dwarka Sector 21", "Dwarka Sector 8",   2);
        g.addEdge("Dwarka Sector 8",  "Dwarka Sector 9",   1);
        g.addEdge("Dwarka Sector 9",  "Dwarka Sector 10",  1);
        g.addEdge("Dwarka Sector 10", "Dwarka Sector 11",  1);
        g.addEdge("Dwarka Sector 11", "Dwarka Sector 12",  1);
        g.addEdge("Dwarka Sector 12", "Dwarka Sector 13",  1);
        g.addEdge("Dwarka Sector 13", "Dwarka Sector 14",  1);
        g.addEdge("Dwarka Sector 14", "Dwarka",            2);
        g.addEdge("Dwarka",           "Dwarka Mor",        2);
        g.addEdge("Dwarka Mor",       "Nawada",            2);
        g.addEdge("Nawada",           "Uttam Nagar West",  1);
        g.addEdge("Uttam Nagar West", "Uttam Nagar East",  1);
        g.addEdge("Uttam Nagar East", "Janakpuri West",    2);
        g.addEdge("Janakpuri West",   "Janakpuri East",    1);
        g.addEdge("Janakpuri East",   "Tilak Nagar",       2);
        g.addEdge("Tilak Nagar",      "Subhash Nagar",     1);
        g.addEdge("Subhash Nagar",    "Tagore Garden",     1);
        g.addEdge("Tagore Garden",    "Rajouri Garden",    1);
        g.addEdge("Rajouri Garden",   "Ramesh Nagar",      1);
        g.addEdge("Ramesh Nagar",     "Moti Nagar",        2);
        g.addEdge("Moti Nagar",       "Kirti Nagar",       1);
        g.addEdge("Kirti Nagar",      "Shadipur",          2);
        g.addEdge("Shadipur",         "Patel Nagar",       1);
        g.addEdge("Patel Nagar",      "Rajendra Place",    1);
        g.addEdge("Rajendra Place",   "Karol Bagh",        2);
        g.addEdge("Karol Bagh",       "Jhandewalan",       2);
        g.addEdge("Jhandewalan",      "Ramakrishna Ashram Marg", 2);
        g.addEdge("Ramakrishna Ashram Marg", "Rajiv Chowk", 1);
        g.addEdge("Rajiv Chowk",      "Barakhamba Road",   1);
        g.addEdge("Barakhamba Road",  "Mandi House",       1);
        g.addEdge("Mandi House",      "Pragati Maidan",    2);
        g.addEdge("Pragati Maidan",   "Indraprastha",      2);
        g.addEdge("Indraprastha",     "Yamuna Bank",       2);
        g.addEdge("Yamuna Bank",      "Akshardham",        3);
        g.addEdge("Akshardham",       "Mayur Vihar-1",     2);
        g.addEdge("Mayur Vihar-1",    "Mayur Vihar Extension", 1);
        g.addEdge("Mayur Vihar Extension", "New Ashok Nagar", 2);
        g.addEdge("New Ashok Nagar",  "Noida Sector 15",   3);
        g.addEdge("Noida Sector 15",  "Noida Sector 16",   1);
        g.addEdge("Noida Sector 16",  "Noida Sector 18",   2);
        g.addEdge("Noida Sector 18",  "Botanical Garden",  3);
        // Vaishali branch from Yamuna Bank
        g.addEdge("Yamuna Bank",      "Kaushambi",         3);
        g.addEdge("Kaushambi",        "Vaishali",          2);

        // ── Red Line (Rithala ↔ Shaheed Sthal) ──────────────────────────────
        g.addStation("Rithala",              "Red");
        g.addStation("Rohini West",          "Red");
        g.addStation("Rohini East",          "Red");
        g.addStation("Pitam Pura",           "Red");
        g.addStation("Kohat Enclave",        "Red");
        g.addStation("Netaji Subhash Place", "Red");
        g.addStation("Keshav Puram",         "Red");
        g.addStation("Kanhaiya Nagar",       "Red");
        g.addStation("Inderlok",             "Red");
        g.addStation("Shastri Nagar",        "Red");
        // Kashmere Gate already added (interchange Yellow-Red)
        g.addStation("Tis Hazari",           "Red");
        g.addStation("Pulbangash",           "Red");
        g.addStation("Pratap Nagar",         "Red");
        g.addStation("Shyam Park",           "Red");
        g.addStation("Major Mohit Sharma",   "Red");
        g.addStation("Raj Bagh",             "Red");
        g.addStation("Shaheed Nagar",        "Red");
        g.addStation("Dilshad Garden",       "Red");
        g.addStation("Jhilmil",              "Red");
        g.addStation("Mansarovar Park",      "Red");
        g.addStation("Shahdara",             "Red");
        g.addStation("Welcome",              "Red");
        g.addStation("Seelampur",            "Red");
        g.addStation("Shahdara Barb",        "Red");
        g.addStation("Shaheed Sthal",        "Red");

        // Red Line edges
        g.addEdge("Rithala",              "Rohini West",          2);
        g.addEdge("Rohini West",          "Rohini East",          1);
        g.addEdge("Rohini East",          "Pitam Pura",           2);
        g.addEdge("Pitam Pura",           "Kohat Enclave",        2);
        g.addEdge("Kohat Enclave",        "Netaji Subhash Place", 2);
        g.addEdge("Netaji Subhash Place", "Keshav Puram",         2);
        g.addEdge("Keshav Puram",         "Kanhaiya Nagar",       2);
        g.addEdge("Kanhaiya Nagar",       "Inderlok",             2);
        g.addEdge("Inderlok",             "Shastri Nagar",        2);
        g.addEdge("Shastri Nagar",        "Kashmere Gate",        3);
        g.addEdge("Kashmere Gate",        "Tis Hazari",           2);
        g.addEdge("Tis Hazari",           "Pulbangash",           1);
        g.addEdge("Pulbangash",           "Pratap Nagar",         1);
        g.addEdge("Pratap Nagar",         "Shyam Park",           3);
        g.addEdge("Shyam Park",           "Major Mohit Sharma",   2);
        g.addEdge("Major Mohit Sharma",   "Raj Bagh",             1);
        g.addEdge("Raj Bagh",             "Shaheed Nagar",        1);
        g.addEdge("Shaheed Nagar",        "Dilshad Garden",       2);
        g.addEdge("Dilshad Garden",       "Jhilmil",              2);
        g.addEdge("Jhilmil",              "Mansarovar Park",      1);
        g.addEdge("Mansarovar Park",      "Shahdara",             1);
        g.addEdge("Shahdara",             "Welcome",              2);
        g.addEdge("Welcome",              "Seelampur",            2);
        g.addEdge("Seelampur",            "Shahdara Barb",        1);
        g.addEdge("Shahdara Barb",        "Shaheed Sthal",        3);

        // ── Violet Line (Kashmere Gate ↔ Raja Nahar Singh) ───────────────────
        g.addStation("Lal Quila",           "Violet");
        g.addStation("Jama Masjid",         "Violet");
        g.addStation("Delhi Gate",          "Violet");
        g.addStation("ITO",                 "Violet");
        // Mandi House already added (Blue line)
        g.addStation("Janpath",             "Violet");
        // Central Secretariat already added (Yellow line)
        g.addStation("Khan Market",         "Violet");
        g.addStation("Jawaharlal Nehru Stadium", "Violet");
        g.addStation("Jangpura",            "Violet");
        g.addStation("Lajpat Nagar",        "Violet");
        g.addStation("Moolchand",           "Violet");
        g.addStation("Kailash Colony",      "Violet");
        g.addStation("Nehru Place",         "Violet");
        g.addStation("Kalkaji Mandir",      "Violet");
        g.addStation("Govind Puri",         "Violet");
        g.addStation("Harkesh Nagar Okhla", "Violet");
        g.addStation("Jasola Apollo",       "Violet");
        g.addStation("Sarita Vihar",        "Violet");
        g.addStation("Mohan Estate",        "Violet");
        g.addStation("Tughlakabad",         "Violet");
        g.addStation("Badarpur Border",     "Violet");
        g.addStation("Sarai",               "Violet");
        g.addStation("NHPC Chowk",          "Violet");
        g.addStation("Mewla Maharajpur",    "Violet");
        g.addStation("Sector 28 Faridabad", "Violet");
        g.addStation("Bata Chowk",          "Violet");
        g.addStation("Escorts Mujesar",     "Violet");
        g.addStation("Sant Surdas",         "Violet");
        g.addStation("Raja Nahar Singh",    "Violet");

        // Violet Line edges (Kashmere Gate → Raja Nahar Singh)
        g.addEdge("Kashmere Gate",          "Lal Quila",           2);
        g.addEdge("Lal Quila",              "Jama Masjid",         2);
        g.addEdge("Jama Masjid",            "Delhi Gate",          1);
        g.addEdge("Delhi Gate",             "ITO",                 2);
        g.addEdge("ITO",                    "Mandi House",         2);
        g.addEdge("Mandi House",            "Janpath",             1);
        g.addEdge("Janpath",                "Central Secretariat", 1);
        g.addEdge("Central Secretariat",    "Khan Market",         2);
        g.addEdge("Khan Market",            "Jawaharlal Nehru Stadium", 2);
        g.addEdge("Jawaharlal Nehru Stadium", "Jangpura",          2);
        g.addEdge("Jangpura",               "Lajpat Nagar",        2);
        g.addEdge("Lajpat Nagar",           "Moolchand",           2);
        g.addEdge("Moolchand",              "Kailash Colony",      2);
        g.addEdge("Kailash Colony",         "Nehru Place",         2);
        g.addEdge("Nehru Place",            "Kalkaji Mandir",      2);
        g.addEdge("Kalkaji Mandir",         "Govind Puri",         2);
        g.addEdge("Govind Puri",            "Harkesh Nagar Okhla", 2);
        g.addEdge("Harkesh Nagar Okhla",    "Jasola Apollo",       2);
        g.addEdge("Jasola Apollo",          "Sarita Vihar",        2);
        g.addEdge("Sarita Vihar",           "Mohan Estate",        2);
        g.addEdge("Mohan Estate",           "Tughlakabad",         3);
        g.addEdge("Tughlakabad",            "Badarpur Border",     3);
        g.addEdge("Badarpur Border",        "Sarai",               2);
        g.addEdge("Sarai",                  "NHPC Chowk",          2);
        g.addEdge("NHPC Chowk",             "Mewla Maharajpur",    2);
        g.addEdge("Mewla Maharajpur",       "Sector 28 Faridabad", 2);
        g.addEdge("Sector 28 Faridabad",    "Bata Chowk",          2);
        g.addEdge("Bata Chowk",             "Escorts Mujesar",     2);
        g.addEdge("Escorts Mujesar",        "Sant Surdas",         3);
        g.addEdge("Sant Surdas",            "Raja Nahar Singh",    3);

        return g;
    }
}
