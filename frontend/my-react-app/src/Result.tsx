import { useLocation } from 'react-router-dom'
import axios from 'axios';
import { useEffect, useState } from 'react';

function Result() {
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

    const [countryData, setCountryData] = useState<CountryData | null>(null); // Use a single object

    const location = useLocation();
    const country = location.search.split('=')[1];

    useEffect(() => {
        axios
          .get(`http://localhost:8080/countries/${country}`) 
          .then((response) => {
            setCountryData(response.data); // Set the response directly
          })
          .catch((error) => {
            console.error("Error fetching country data:", error);
          });
      }, [country]);

    console.log(countryData?.overall); // Use optional chaining to avoid null errors

    return (
        <div>
            <h1>Result for {country}</h1>
            {countryData && (
                <div>
                    <p>Overall: {countryData.overall}</p>
                    <p>Affordability: {countryData.affordability}</p>
                    <p>Availability: {countryData.availability}</p>
                    <p>Quality: {countryData.quality}</p>
                    <p>Sustainability: {countryData.sustainability}</p>
                    <p>Overall Rank: {countryData.overallrank}</p>
                    <p>Affordability Rank: {countryData.affordabilityrank}</p>
                    <p>Availability Rank: {countryData.availabilityrank}</p>
                    <p>Quality Rank: {countryData.qualityrank}</p>
                    <p>Sustainability Rank: {countryData.sustainabilityrank}</p>
                </div>
            )}
        </div>
    );
}
export default Result;