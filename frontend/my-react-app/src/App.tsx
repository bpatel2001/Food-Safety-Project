import { useState, useEffect } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import { Combobox } from "react-widgets";
import "react-widgets/styles.css"; // Ensure styles are imported

function App() {
  useEffect(() => {
    console.log("Rendering App...");
  }, []);

  interface CountryData {
    country: string;
    overall: number;
    affordability: number;
    availability: number;
    quality: number;
    sustainability: number;
    overallrank: number;
    affordabilityrank: number;
    availabilityrank: number;
    qualityrank: number;
    sustainabilityrank: number;
  }

  const navigate = useNavigate();
  const [countries, setCountries] = useState<CountryData[]>([]);
  const [selectedCountry, setSelectedCountry] = useState<string>("");

  useEffect(() => {
    const storedCountries = localStorage.getItem("countries");
    if (storedCountries) {
      try {
        setCountries(JSON.parse(storedCountries));
        console.log("Loaded from localStorage:", storedCountries);
      } catch (error) {
        console.error("Error parsing localStorage data:", error);
        localStorage.removeItem("countries"); 
      }
    } else {
      console.log("Fetching countries..");
      axios
        .get("http://localhost:8080/countries")
        .then((response) => {
          setCountries(response.data);
          localStorage.setItem("countries", JSON.stringify(response.data));
        })
        .catch((error) => {
          console.error("Error fetching countries:", error);
        });
    }
  }, []);

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    if (!selectedCountry) {
      alert("Please select a country!");
      return;
    }
    navigate(`/result?country=${selectedCountry}`);
  };

  return (
    <>
      <div>
        <p className="text-blue-100 bg-blue-500 text-4xl">Food Safety Viewer</p>
        <form onSubmit={handleSubmit}>
          <div className="flex justify-center">
            <Combobox
              name="country"
              data={countries.map((c) => c.country)} 
              value={selectedCountry} 
              onChange={(value) => setSelectedCountry(value)} 
              placeholder="Select or type a country"
              className="border rounded p-2 w-64"
            />
          </div>
          <div className="flex justify-center mt-4">
            <button type="submit" className="border rounded p-2">
              Submit
            </button>
          </div>
        </form>
      </div>
    </>
  );
}

export default App;