// [START maps_http_roads_snaptoroads_no_interpolation]
OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
Request request = new Request.Builder()
  .url("https://roads.googleapis.com/v1/snapToRoads?path=-35.27801%2C149.12958%7C-35.28032%2C149.12907%7C-35.28099%2C149.12929%7C-35.28144%2C149.12984%7C-35.28194%2C149.13003%7C-35.28282%2C149.12956%7C-35.28302%2C149.12881%7C-35.28473%2C149.12836&key=YOUR_API_KEY")
  .method("GET", null)
  .build();
Response response = client.newCall(request).execute();
// [END maps_http_roads_snaptoroads_no_interpolation]