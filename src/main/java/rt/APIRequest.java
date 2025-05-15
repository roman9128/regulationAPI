package rt;

public class APIRequest {
    private final String BASE_URL = "https://regulation.gov.ru/api/npalist";
    private String id = "";
    private String limit = "limit=100"; // default value
    private String offset = "";
    private String search = "";
    private String sort = "";

    public APIRequest id(int id) {
        this.id = String.valueOf(id);
        return this;
    }

    public APIRequest limit(int limit) {
        if (limit > 500) {
            limit = 500;
        }
        if (limit < 1) {
            limit = 1;
        }
        this.limit = "limit=" + limit;
        return this;
    }

    /**
     * сдвиг относительно первого элемента списка. Например, если лимит = 5, а сдвиг = 3, то первым элементом нового списка будет четвёртый элемент изначального списка
     * @param offset
     * @return
     */
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
        if (!id.isBlank()) {
            request.append("/").append(id);
        } else {
            request.append("?").append(limit);
            if (!offset.isBlank()) {
                request.append("&");
            }
            request.append(offset);
            if (!search.isBlank()) {
                request.append("&");
            }
            request.append(search);
            if (!sort.isBlank()) {
                request.append("&");
            }
            request.append(sort);
        }
        return request.toString();
    }
}