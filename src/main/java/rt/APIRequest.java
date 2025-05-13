package rt;

public class APIRequest {
    private final String BASE_URL = "https://regulation.gov.ru/api/npalist";
    private String id = "";
    private String limit = "";
    private String offset = "";
    private String search = "";
    private String sort = "";

    public APIRequest id(int id) {
        this.id = String.valueOf(id);
        return this;
    }

    public APIRequest limit(int limit) {
        this.limit = "limit=" + limit;
        return this;
    }

    public APIRequest offset(int offset) {
        this.offset = "offset=" + offset;
        return this;
    }

    public APIRequest search(String search) {
        this.search = "search=" + search;
        return this;
    }

    public APIRequest sort() {
        this.sort = "sort=desc";
        return this;
    }

    public String build() {
        StringBuilder request = new StringBuilder(BASE_URL);
        if (!this.id.isBlank()) {
            request.append("/").append(id);
        } else {
            request.append("?").append(limit);
            if (!limit.isBlank()) {
                request.append("&");
            }
            request.append(offset);
            if (!offset.isBlank()) {
                request.append("&");
            }
            request.append(search);
            if (!search.isBlank()) {
                request.append("&");
            }
            request.append(sort);
        }
        return request.toString();
    }
}