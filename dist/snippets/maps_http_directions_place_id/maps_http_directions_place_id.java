// [START maps_http_directions_place_id]
OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
Request request = new Request.Builder()
  .url("https://maps.googleapis.com/maps/api/directions/json?origin=place_id%3AChIJ685WIFYViEgRHlHvBbiD5nE&destination=place_id%3AChIJA01I-8YVhkgRGJb0fW4UX7Y&key=YOUR_API_KEY")
  .method("GET", null)
  .build();
Response response = client.newCall(request).execute();
// [END maps_http_directions_place_id]