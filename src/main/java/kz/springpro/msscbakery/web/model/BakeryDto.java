package kz.springpro.msscbakery.web.model;

import java.util.UUID;

public class BakeryDto {
    private UUID id;
    private String name;
    private String typeOfProduct;
    private Double calorie;
    private Long upc;


    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public static class BakeryDtoBuilder {
        @SuppressWarnings("all")
        private UUID id;
        @SuppressWarnings("all")
        private String name;
        @SuppressWarnings("all")
        private String typeOfProduct;
        @SuppressWarnings("all")
        private Double calorie;
        @SuppressWarnings("all")
        private Long upc;

        @SuppressWarnings("all")
        BakeryDtoBuilder() {
        }

        @SuppressWarnings("all")
        public BakeryDto.BakeryDtoBuilder id(final UUID id) {
            this.id = id;
            return this;
        }

        @SuppressWarnings("all")
        public BakeryDto.BakeryDtoBuilder name(final String name) {
            this.name = name;
            return this;
        }

        @SuppressWarnings("all")
        public BakeryDto.BakeryDtoBuilder typeOfProduct(final String typeOfProduct) {
            this.typeOfProduct = typeOfProduct;
            return this;
        }

        @SuppressWarnings("all")
        public BakeryDto.BakeryDtoBuilder calorie(final Double calorie) {
            this.calorie = calorie;
            return this;
        }

        @SuppressWarnings("all")
        public BakeryDto.BakeryDtoBuilder upc(final Long upc) {
            this.upc = upc;
            return this;
        }

        @SuppressWarnings("all")
        public BakeryDto build() {
            return new BakeryDto(this.id, this.name, this.typeOfProduct, this.calorie, this.upc);
        }

        @Override
        @SuppressWarnings("all")
        public String toString() {
            return "BakeryDto.BakeryDtoBuilder(id=" + this.id + ", name=" + this.name + ", typeOfProduct=" + this.typeOfProduct + ", calorie=" + this.calorie + ", upc=" + this.upc + ")";
        }
    }

    @SuppressWarnings("all")
    public static BakeryDto.BakeryDtoBuilder builder() {
        return new BakeryDto.BakeryDtoBuilder();
    }

    @SuppressWarnings("all")
    public UUID getId() {
        return this.id;
    }

    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public String getTypeOfProduct() {
        return this.typeOfProduct;
    }

    @SuppressWarnings("all")
    public Double getCalorie() {
        return this.calorie;
    }

    @SuppressWarnings("all")
    public Long getUpc() {
        return this.upc;
    }

    @SuppressWarnings("all")
    public void setId(final UUID id) {
        this.id = id;
    }

    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setTypeOfProduct(final String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    @SuppressWarnings("all")
    public void setCalorie(final Double calorie) {
        this.calorie = calorie;
    }

    @SuppressWarnings("all")
    public void setUpc(final Long upc) {
        this.upc = upc;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BakeryDto)) return false;
        final BakeryDto other = (BakeryDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$calorie = this.getCalorie();
        final Object other$calorie = other.getCalorie();
        if (this$calorie == null ? other$calorie != null : !this$calorie.equals(other$calorie)) return false;
        final Object this$upc = this.getUpc();
        final Object other$upc = other.getUpc();
        if (this$upc == null ? other$upc != null : !this$upc.equals(other$upc)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$typeOfProduct = this.getTypeOfProduct();
        final Object other$typeOfProduct = other.getTypeOfProduct();
        if (this$typeOfProduct == null ? other$typeOfProduct != null : !this$typeOfProduct.equals(other$typeOfProduct)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof BakeryDto;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $calorie = this.getCalorie();
        result = result * PRIME + ($calorie == null ? 43 : $calorie.hashCode());
        final Object $upc = this.getUpc();
        result = result * PRIME + ($upc == null ? 43 : $upc.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $typeOfProduct = this.getTypeOfProduct();
        result = result * PRIME + ($typeOfProduct == null ? 43 : $typeOfProduct.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "BakeryDto(id=" + this.getId() + ", name=" + this.getName() + ", typeOfProduct=" + this.getTypeOfProduct() + ", calorie=" + this.getCalorie() + ", upc=" + this.getUpc() + ")";
    }

    @SuppressWarnings("all")
    public BakeryDto() {
    }

    @SuppressWarnings("all")
    public BakeryDto(final UUID id, final String name, final String typeOfProduct, final Double calorie, final Long upc) {
        this.id = id;
        this.name = name;
        this.typeOfProduct = typeOfProduct;
        this.calorie = calorie;
        this.upc = upc;
    }
    //</editor-fold>
}
