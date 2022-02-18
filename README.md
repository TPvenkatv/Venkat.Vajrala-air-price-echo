# Venkat.Vajrala-air-price-echo
Air price echo service with swagger/openapi  generated models

### Sample request:
{
    "@type": "OfferQueryBuildFromProducts",
    "BuildFromProductsRequest": {
        "@type": "BuildFromProductsRequestAir",
        "PassengerCriteria": [
            "java.util.ArrayList",
            [
                {
                    "@type": "PassengerCriteria",
                    "number": 2,
                    "age": 24,
                    "passengerTypeCode": "ADT"
                }
            ]
        ],
        "ProductCriteriaAir": [
            "java.util.ArrayList",
            [
                {
                    "@type": "ProductCriteriaAir",
                    "sequence": 0,
                    "SpecificFlightCriteria": [
                        "java.util.ArrayList",
                        [
                            {
                                "@type": "SpecificFlightCriteria",
                                "carrier": "AA",
                                "flightNumber": "1643",
                                "departureDate": "2021-03-04",
                                "departureTime": "12:30:00",
                                "arrivalDate": "2021-03-04",
                                "arrivalTime": "13:39:00",
                                "from": "ATL",
                                "to": "CLT",
                                "cabin": "Economy",
                                "classOfService": "N",
                                "segmentSequence": 1
                            },
                            {
                                "@type": "SpecificFlightCriteria",
                                "carrier": "AA",
                                "flightNumber": "642",
                                "departureDate": "2021-03-04",
                                "departureTime": "14:25:00",
                                "arrivalDate": "2021-03-04",
                                "arrivalTime": "16:14:00",
                                "from": "CLT",
                                "to": "LGA",
                                "cabin": "Economy",
                                "classOfService": "N",
                                "segmentSequence": 2
                            }
                        ]
                    ]
                }
            ]
        ]
    }
}
