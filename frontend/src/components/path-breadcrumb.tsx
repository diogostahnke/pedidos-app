import {
  Breadcrumb,
  BreadcrumbItem,
  BreadcrumbLink,
  BreadcrumbList,
  BreadcrumbSeparator,
} from "@/components/ui/breadcrumb";
import { paths } from "@/config/paths";
import React from "react";
import { Link, useLocation } from "react-router-dom";

function PathBreadCrumb() {
  const location = useLocation();
  const pathsList =
    location.pathname === "/" ? [""] : location.pathname.split("/");

  return (
    <Breadcrumb>
      <BreadcrumbList>
        {pathsList.map((item, index) => (
          <React.Fragment key={item}>
            {index !== 0 && <BreadcrumbSeparator className="hidden md:block" />}
            <BreadcrumbItem className="hidden md:block">
              <BreadcrumbLink asChild>
                <Link to={item}>
                  {paths.find((path) => path.path === item)?.title}
                </Link>
              </BreadcrumbLink>
            </BreadcrumbItem>
          </React.Fragment>
        ))}
      </BreadcrumbList>
    </Breadcrumb>
  );
}

export default PathBreadCrumb;
